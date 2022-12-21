package io.vacco.beleth.helm;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

import static io.vacco.beleth.helm.BlHelmGen.*;
import static io.vacco.beleth.helm.BlHelmCrd.*;

public class BlHelmValues {

  public static JsonNode scanNode(File helmRoot, Yaml yaml, ObjectMapper om, String repoAlias) {
    var chartFile = new File(helmRoot, "Chart.yaml");
    var valuesFile = new File(helmRoot, "values.yaml");
    var valuesSchemaFile = new File(helmRoot, "values.schema.json");
    try {
      var chartYaml = yaml.load(new FileReader(chartFile));
      var chartTree = om.valueToTree(chartYaml);
      var name = chartTree.get("name").textValue();
      var javaPkg = stripDash(String.format("%s.%s", repoAlias, name));
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

  public static File scanDocument(File helmRoot, Yaml yaml, ObjectMapper om, ObjectWriter ow, String repoAlias) {
    try {
      var schemas = new ArrayList<JsonNode>();
      var fileStr = Files.find(
        helmRoot.toPath(), Integer.MAX_VALUE,
        (filePath, fileAttr) -> filePath.toString().endsWith(".yaml")
      );
      try (fileStr) {
        fileStr.forEach(p -> schemas.addAll(crdScanDocument(p.toFile(), yaml, om)));
      }
      schemas.add(scanNode(helmRoot, yaml, om, repoAlias));

      var schemasRoot = new File(helmRoot, "jsonSchemas");
      schemasRoot.mkdirs();
      for (var s : schemas) {
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

}
