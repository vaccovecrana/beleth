package io.vacco.beleth.helm;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import io.vacco.beleth.gen.BlGenConfig;
import io.vacco.cpiohell.*;
import org.jsonschema2pojo.Jsonschema2Pojo;
import org.jsonschema2pojo.RuleLogger;
import org.jsonschema2pojo.SourceType;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;

public class BlHelmGen {

  private static final String javaType = "javaType";
  private static final String generateRaw = "generateRaw";

  private final ObjectMapper om = new ObjectMapper();
  private final ObjectWriter ow = om.writerWithDefaultPrettyPrinter();
  private final Yaml yaml = new Yaml();

  public File unpack(URL helmUrl, File downloadDir) {
    var urlHash = Integer.toHexString(Objects.requireNonNull(helmUrl).hashCode());
    var archiveDir = new File(downloadDir, urlHash);
    var archiveFile = new File(archiveDir, String.format("%s.tar.gz", urlHash));
    archiveDir.mkdirs();
    CoDownload.apply(helmUrl, archiveFile);
    CoExpand.apply(archiveFile.toPath(), archiveDir.toPath(), true);
    return archiveDir;
  }

  public List<JsonNode> crdScanNode(JsonNode root) {
    var out = new ArrayList<JsonNode>();
    try {
      var spec = root.get("spec");
      var group = spec.get("group");
      var names = spec.get("names");
      var kind = names.get("kind");
      spec.get("versions").forEach(jn -> {
        var pkgRoot = Arrays.asList(group.textValue().split("\\."));
        Collections.reverse(pkgRoot);
        var javaClass = String.format("%s.%s.%s",
          String.join(".", pkgRoot), jn.get("name").textValue(), kind.textValue()
        );
        var schema = (ObjectNode) jn.at("/schema/openAPIV3Schema");
        schema.set(javaType, new TextNode(javaClass));
        out.add(schema);
      });
    } catch (Exception e) {
      throw new IllegalStateException(String.format("Unable to process CRD: %s", root));
    }
    return out;
  }

  public List<JsonNode> crdScanDocument(File yamlIn) {
    var out = new ArrayList<JsonNode>();
    try {
      System.out.println(yamlIn);
      var yTrees = yaml.loadAll(new FileReader(yamlIn));
      yTrees.forEach(yt -> {
        if (yt != null) {
          var tree = om.valueToTree(yt);
          var kind = tree.get("kind");
          if (kind != null && kind.isTextual() && kind.textValue().equals("CustomResourceDefinition")) {
            out.addAll(crdScanNode(tree));
          }
        }
      });
    } catch (Exception e) {
      System.out.println("Can't read yaml: " + e);
    }
    return out;
  }

  public JsonNode valuesScan(File helmRoot) {
    var chartFile = new File(helmRoot, "Chart.yaml");
    var valuesFile = new File(helmRoot, "values.yaml");
    var valuesSchemaFile = new File(helmRoot, "values.schema.json");
    try {
      var chartYaml = yaml.load(new FileReader(chartFile));
      var chartTree = om.valueToTree(chartYaml);
      var home = chartTree.get("home").textValue().split("/");
      var javaClass = String.format("%s.%s.Values", home[home.length - 2], home[home.length - 1]);
      if (valuesSchemaFile.exists()) {
        var valuesSchemaTree = (ObjectNode) om.readTree(valuesSchemaFile);
        valuesSchemaTree.set(javaType, new TextNode(javaClass));
        return valuesSchemaTree;
      } else {
        var valuesTree = (ObjectNode) om.valueToTree(yaml.load(new FileReader(valuesFile)));
        valuesTree.set(javaType, new TextNode(javaClass));
        valuesTree.set("generateRaw", BooleanNode.getTrue());
        return valuesTree;
      }
    } catch (Exception e) {
      throw new IllegalStateException(String.format("Unable to scan helm resources at [%s]", helmRoot), e);
    }
  }

  public File scan(File helmRoot) {
    try {
      var schemas = new ArrayList<JsonNode>();
      var fileStr = Files.find(
        helmRoot.toPath(), Integer.MAX_VALUE,
        (filePath, fileAttr) -> filePath.toString().endsWith(".yaml")
      );
      try (fileStr) {
        fileStr.forEach(p -> schemas.addAll(crdScanDocument(p.toFile())));
      }
      schemas.add(valuesScan(helmRoot));

      File schemasRoot = new File(helmRoot, "jsonSchemas");
      schemasRoot.mkdirs();
      for (JsonNode s : schemas) {
        var schemaTxt = om.writeValueAsString(s);
        var schemaHash = Integer.toHexString(schemaTxt.hashCode());
        var isRaw = s.get(generateRaw) != null;
        var schemaFile = new File(schemasRoot,
          String.format("%s.json",
            isRaw
              ? String.format("raw-%s", schemaHash)
              : schemaHash
            )
        );
        ow.writeValue(schemaFile, s);
      }
      return schemasRoot;
    } catch (Exception e) {
      throw new IllegalStateException(
        String.format(
          "Unable to process Helm definitions for [%s]",
          helmRoot == null ? "" : helmRoot.getAbsoluteFile().toString()
        ), e
      );
    }
  }

  public File generate(File schemasRoot, BlGenConfig cfg, RuleLogger logger) throws IOException {
    var schemaUrls = new ArrayList<URL>();
    var rawFiles = new ArrayList<File>();
    for (File f : Objects.requireNonNull(schemasRoot.listFiles())) {
      var u = f.toURI().toURL();
      if (!f.getName().startsWith("raw-")) {
        schemaUrls.add(u);
      } else {
        rawFiles.add(f);
      }
    }
    var javaSources = new File(schemasRoot.getParentFile(), "java");
    javaSources.mkdirs();

    cfg
      .withSources(schemaUrls.toArray(URL[]::new))
      .withSourceType(SourceType.JSONSCHEMA)
      .withTargetDirectory(javaSources)
      .withTargetPackage("");
    Jsonschema2Pojo.generate(cfg, logger);

    for (File f : rawFiles) {
      var tree = (ObjectNode) om.readTree(f);
      var javaClass = tree.remove(javaType).textValue();
      tree.remove(generateRaw);
      om.writeValue(f, tree);
      cfg
        .withSources(f.toURI().toURL())
        .withSourceType(SourceType.JSON)
        .withTargetPackage(javaClass)
      ;
      Jsonschema2Pojo.generate(cfg, logger);
    }

    return javaSources;
  }

}
