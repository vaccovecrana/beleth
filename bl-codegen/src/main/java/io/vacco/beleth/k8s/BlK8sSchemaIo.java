package io.vacco.beleth.k8s;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import java.io.File;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

import static io.vacco.beleth.util.BlMaps.*;
import static io.vacco.beleth.util.BlIterators.*;

public class BlK8sSchemaIo {

  public static final String $ref = "$ref";

  private final ObjectMapper om = new ObjectMapper();

  private String rawTypeOf(String k8sType) {
    var toks = k8sType.split("\\.");
    return toks[toks.length - 1];
  }

  private ObjectNode propNode(List<String> k8sDefs) {
    var propList =  k8sDefs.stream().map(def -> {
      var rt = rawTypeOf(def);
      return kv(rt, obj(kv($ref, String.format("#/definitions/%s", rt))));
    }).collect(Collectors.toList());
    var props = obj();
    for (Map.Entry<String, Map<String, String>> e : propList) {
      props.put(e.getKey(), e.getValue());
    }
    return om.valueToTree(props);
  }

  private void swapRefs(ObjectNode root) {
    var fl = listFrom(root.fields());
    for (Map.Entry<String, JsonNode> e : fl) {
      if (e.getKey().equals("$ref")) {
        var n = root.remove($ref);
        if (n.isTextual()) {
          var tn = (TextNode) n;
          var rt = rawTypeOf(tn.asText());
          root.set($ref, new TextNode(String.format("#/definitions/%s", rt)));
        }
      } else if (e.getValue().isObject()) {
        swapRefs((ObjectNode) e.getValue());
      }
    }
  }

  public void prepareSchema(URL k8sSwaggerUrl, File out) {
    try {
      var tree = (ObjectNode) om.readTree(k8sSwaggerUrl);
      var defs = (ObjectNode) tree.get("definitions");
      var k8sDefs = listFrom(defs.fieldNames());

      k8sDefs = k8sDefs.stream()
        .filter(d -> !d.startsWith("io.k8s.apiextensions-apiserver"))
        .collect(Collectors.toList());

      tree.set("type", new TextNode("object"));
      tree.set("properties", propNode(k8sDefs));

      for (String defKey : k8sDefs) {
        var def = (ObjectNode) defs.remove(defKey);
        var rt = rawTypeOf(defKey);
        def.set("javaType", new TextNode(defKey.replace("-", "_")));
        defs.set(rt, def);
        swapRefs(def);
      }

      om.writeValue(out, tree);
    } catch (Exception e) {
      throw new IllegalStateException(
        String.format("Unable to generate types for schema [%s]", k8sSwaggerUrl)
      );
    }
  }

}
