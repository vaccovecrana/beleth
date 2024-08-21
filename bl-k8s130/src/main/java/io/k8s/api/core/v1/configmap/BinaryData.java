package io.k8s.api.core.v1.configmap;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class BinaryData extends LinkedHashMap<String, String> {
  public BinaryData kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static BinaryData binaryData() {
    return new BinaryData();
  }
}
