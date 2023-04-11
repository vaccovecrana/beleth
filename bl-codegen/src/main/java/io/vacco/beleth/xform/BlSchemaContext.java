package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import jakarta.json.*;
import org.slf4j.*;
import java.util.*;

import static io.vacco.beleth.xform.BlSchemas.*;
import static java.lang.String.*;

public class BlSchemaContext {

  private static final Logger log = LoggerFactory.getLogger(BlSchemaContext.class);
  private static final ClassName javaList = ClassName.get(List.class);

  public final Map<String, BlSchema> schemaIdx = new TreeMap<>();

  public static String upperCaseFirst(String raw) {
    return format("%s%s", valueOf(raw.charAt(0)).toUpperCase(), raw.substring(1));
  }

  private void register(BlSchema schema) {
    schemaIdx.put(schema.name.toString(), schema);
  }

  private BlSchema initSchema(String packageName, String rawName, JsonObject doc) {
    BlSchema schema = new BlSchema()
      .withName(packageName, upperCaseFirst(rawName))
      .withDocument(doc.asJsonObject());
    register(schema);
    build(schema);
    return schema;
  }

  private Optional<BlType> build(String property, JsonObject obj, BlSchema parent) {
    if (isRef(obj)) {
      return Optional.of(getRefTypeOf(obj));
    } else if (isPrimitive(obj)) {
      if (isEnum(obj)) {
        return Optional.of(initSchema(parent.getRootPackage(), property, obj));
      } else {
        return Optional.of(getPrimitiveTypeOf(obj));
      }
    } else if (isObject(obj)) {
      return Optional.of(initSchema(parent.getRootPackage(), property, obj));
    } else if (isArray(obj)) {
      var itemObj = obj.getJsonObject(kItems);
      var itemProp = format("%sItem", property);
      var itemType = build(itemProp, itemObj, parent);
      if (itemType.isPresent()) {
        return Optional.of(
          new BlType()
            .withName(ParameterizedTypeName.get(javaList, itemType.get().name))
            .withDocument(obj)
        );
      }
    }
    log.warn("Schema {} contains unmappable declaration: {}", parent, obj);
    return Optional.empty();
  }

  private void build(BlSchema schema) {
    if (schema.document.containsKey(kProperties)) {
      var props = schema.document.get(kProperties).asJsonObject();
      for (var ep : props.entrySet()) {
        build(ep.getKey(), ep.getValue().asJsonObject(), schema)
          .ifPresent(type -> schema.addPropType(ep.getKey(), type));
      }
    } else if (isEnum(schema.document)) {
      schema.withEnum(true);
    } else if (isPrimitive(schema.document)) {
      schema.withPrimitiveType(getPrimitiveTypeOf(schema.document));
    } else {
      schema.withOpen(true);
      if (hasAdditionalPropTypes(schema.document)) {
        build(kAdditionalProperties, schema.document.getJsonObject(kAdditionalProperties), schema)
          .ifPresent(schema::withAdditionalPropType);
      }
    }
  }

  public void update(List<BlSchema> schemas) {
    for (var schema : schemas) {
      register(schema);
      build(schema);
    }
  }

}
