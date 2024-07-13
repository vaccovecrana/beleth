package io.k8s.apimachinery.pkg.runtime;

import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class RawExtension extends LinkedHashMap<String, Object> {
  public RawExtension kv(String key, Object value) {
    put(key, value);
    return this;
  }

  public static RawExtension rawExtension() {
    return new RawExtension();
  }
}
