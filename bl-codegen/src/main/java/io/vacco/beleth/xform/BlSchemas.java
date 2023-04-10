package io.vacco.beleth.xform;

import jakarta.json.JsonObject;
import java.util.*;

public class BlSchemas {

  public static final String
    kItems = "items",
    kProperties = "properties",
    kType = "type",
    kJavaRef = "javaRef";

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
    javaTypeIdx.put(tNumber, double.class);
    javaTypeIdx.put(tInteger, long.class);
    javaTypeIdx.put(tBoolean, boolean.class);
  }

  public static boolean isKeyMatch(JsonObject doc, String key, String value) {
    return doc.containsKey(key) && doc.getString(key).equals(value);
  }

  public static Optional<Class<?>> hasPrimitive(JsonObject prop) {
    if (prop.containsKey(kType)) {
      if (javaTypeIdx.containsKey(prop.getString(kType))) {
        return Optional.of(javaTypeIdx.get(prop.getString(kType)));
      }
    }
    return Optional.empty();
  }



}
