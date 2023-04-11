package io.k8s.api.core.v1.persistentvolumespec;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Capacity extends LinkedHashMap<String, String> {
  public Capacity kv(String key, String value) {
    put(key, value);
    return this;
  }
}
