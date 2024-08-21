package io.k8s.api.core.v1.limitrangeitem;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Max extends LinkedHashMap<String, String> {
  public Max kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Max max() {
    return new Max();
  }
}
