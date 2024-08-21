package io.k8s.api.core.v1.nodestatus;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Capacity extends LinkedHashMap<String, String> {
  public Capacity kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Capacity capacity() {
    return new Capacity();
  }
}
