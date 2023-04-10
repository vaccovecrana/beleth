package io.vacco.beleth.xform;

import jakarta.json.*;
import java.util.*;

import static io.vacco.beleth.xform.BlSchemas.*;
import static java.lang.String.*;

public class BlSchemaContext {

  public String upperCaseFirst(String raw) {
    return format("%s%s", valueOf(raw.charAt(0)).toUpperCase(), raw.substring(1));
  }

  public BlSchema initSchema(String rawName, JsonValue doc, BlSchema parent) {
    var schema = new BlSchema()
      .withFqn(upperCaseFirst(rawName), parent.getFqn().toLowerCase())
      .withDocument(doc.asJsonObject())
      .withParent(parent);
    parent.fieldRefs.put(rawName, schema.getFqn());
    return schema;
  }

  public void buildTail(BlSchema root, BlSchemaIndex idx) {
    if (!idx.containsKey(root.getFqn())) {
      idx.put(root.getFqn(), root);
      if (root.document.containsKey(kProperties)) {
        var props = root.document.get(kProperties).asJsonObject();
        for (var pe : props.entrySet()) {
          var obj = pe.getValue().asJsonObject();
          if (isKeyMatch(obj, kType, vObject)) {
            buildTail(initSchema(pe.getKey(), pe.getValue(), root), idx);
          } else if (isKeyMatch(obj, kType, vArray)) {
            var items = obj.get(kItems).asJsonObject();
            if (isKeyMatch(items, kType, vObject)) {
              buildTail(initSchema(pe.getKey(), items, root), idx);
            }
          }
        }
      }
    }
  }

  public BlSchemaIndex build(List<BlSchema> schemas) {
    var idx = new BlSchemaIndex();
    for (var schema : schemas) {
      buildTail(schema, idx);
    }
    return idx;
  }

}
