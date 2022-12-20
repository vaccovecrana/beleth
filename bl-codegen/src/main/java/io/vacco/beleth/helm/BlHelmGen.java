package io.vacco.beleth.helm;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import io.vacco.beleth.gen.*;
import io.vacco.cpiohell.*;
import org.jsonschema2pojo.*;
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
    var urlHash = Integer.toHexString(Objects.requireNonNull(helmUrl).toString().hashCode());
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
      // Relatively safe to ignore.
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
      var home = chartTree.get("home").textValue();
      var name = chartTree.get("name").textValue();
      var javaPkg = String.format("h%s.%s", Integer.toHexString(home.hashCode()), name);
      if (valuesSchemaFile.exists()) {
        var valuesSchemaTree = (ObjectNode) om.readTree(valuesSchemaFile);
        valuesSchemaTree.set(javaType, new TextNode(String.format("%s.Values", javaPkg)));
        return valuesSchemaTree;
      } else {
        var valuesTree = (ObjectNode) om.valueToTree(yaml.load(new FileReader(valuesFile)));
        valuesTree.set(javaType, new TextNode(javaPkg));
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
              ? "Values"
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
    var javaSources = new File(schemasRoot.getParentFile(), "java");
    javaSources.mkdirs();

    for (File f : Objects.requireNonNull(schemasRoot.listFiles())) {
      var u = f.toURI().toURL();
      if (!f.getName().startsWith("Values")) {
        schemaUrls.add(u);
      } else {
        rawFiles.add(f);
      }
    }

    for (File f : rawFiles) {
      var tree = (ObjectNode) om.readTree(f);
      var javaPkg = tree.remove(javaType).textValue().replace("-", "_");
      tree.remove(generateRaw);
      om.writeValue(f, tree);
      cfg
        .withSources(f.toURI().toURL())
        .withSourceType(SourceType.JSON)
        .withTargetDirectory(javaSources)
        .withTargetPackage(javaPkg);
      Jsonschema2Pojo.generate(cfg, logger);
    }

    cfg
      .withSources(schemaUrls.toArray(URL[]::new))
      .withSourceType(SourceType.JSONSCHEMA)
      .withTargetDirectory(javaSources)
      .withTargetPackage("")
      .withRemoveOldOutput(false);
    Jsonschema2Pojo.generate(cfg, logger);

    return javaSources;
  }

  public File apply(URL helmUrl, File stageDir, RuleLogger logger) {
    try {
      var helmRoot = unpack(helmUrl, stageDir);
      var schemasRoot = scan(helmRoot);
      return generate(schemasRoot, new BlGenConfig(), logger);
    } catch (Exception e) {
      throw new IllegalStateException(
        String.format("Unable to process Helm definitions. [%s, %s]", helmUrl, stageDir),
        e
      );
    }
  }

}
