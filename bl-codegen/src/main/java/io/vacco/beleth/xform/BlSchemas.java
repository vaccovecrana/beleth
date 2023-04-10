package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import jakarta.json.JsonObject;
import java.util.*;

public class BlSchemas {

  public static final String
    kAdditionalProperties = "additionalProperties",
    kEnum = "enum",
    kItems = "items",
    kProperties = "properties",
    kType = "type",
    kRef = "$ref";

  public static final String
    vArray = "array",
    vObject = "object";

  public static final String
    tString = "string",
    tNumber = "number",
    tInteger = "integer",
    tBoolean = "boolean";

  public static Map<String, Class<?>> javaTypeIdx = new TreeMap<>();

  static {
    javaTypeIdx.put(tString, String.class);
    javaTypeIdx.put(tNumber, Double.class);
    javaTypeIdx.put(tInteger, Long.class);
    javaTypeIdx.put(tBoolean, Boolean.class);
  }

  public static boolean isKeyMatch(JsonObject doc, String key, String value) {
    return doc.containsKey(key) && doc.getString(key).equals(value);
  }

  public static boolean isObject(JsonObject obj) {
    return isKeyMatch(obj, kType, vObject);
  }

  public static boolean isArray(JsonObject obj) {
    return isKeyMatch(obj, kType, vArray);
  }

  public static boolean isEnum(JsonObject obj) {
    return obj.containsKey(kEnum);
  }

  public static boolean hasAdditionalPropTypes(JsonObject obj) {
    if (obj.containsKey(kAdditionalProperties)) {
      var addProps = obj.get(kAdditionalProperties);
      return addProps instanceof JsonObject;
    }
    return false;
  }

  public static boolean isPrimitive(JsonObject obj) {
    return obj.containsKey(kType) && javaTypeIdx.containsKey(obj.getString(kType));
  }

  public static TypeName getPrimitive(JsonObject obj) {
    var cls = javaTypeIdx.get(obj.getString(kType));
    if (cls == null) {
      throw new IllegalArgumentException(String.format(
        "Not a Java primitive type: %s", obj
      ));
    }
    return ClassName.get(cls);
  }

  public static BlType getPrimitiveTypeOf(JsonObject obj) {
    return new BlType()
      .withName(getPrimitive(obj))
      .withDocument(obj);
  }

  public static boolean isRef(JsonObject obj) {
    return obj.containsKey(kRef);
  }

  public static BlType getRefTypeOf(JsonObject obj) {
    var path = obj.getString(kRef);
    var parts = path.split("/");
    return new BlType().withName(parts[parts.length - 1]);
  }

}
