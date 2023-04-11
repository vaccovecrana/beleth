package io.k8s.api.discovery.v1.endpoint;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class DeprecatedTopology extends LinkedHashMap<String, String> {
  public DeprecatedTopology kv(String key, String value) {
    put(key, value);
    return this;
  }
}
