package io.vacco.beleth.helm;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.*;

import static io.vacco.beleth.helm.BlHelmGen.*;

public class BlHelmCrd {

  public static List<JsonNode> crdScanNode(JsonNode root) {
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

  public static List<JsonNode> crdScanDocument(File yamlIn, Yaml yaml, ObjectMapper om) {
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

}
