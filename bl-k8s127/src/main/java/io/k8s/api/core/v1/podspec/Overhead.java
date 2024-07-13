package io.k8s.api.core.v1.podspec;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Overhead extends LinkedHashMap<String, String> {
  public Overhead kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Overhead overhead() {
    return new Overhead();
  }
}
