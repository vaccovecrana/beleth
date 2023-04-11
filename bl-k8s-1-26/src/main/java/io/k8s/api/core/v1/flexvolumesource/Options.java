package io.k8s.api.core.v1.flexvolumesource;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Options extends LinkedHashMap<String, String> {
  public Options kv(String key, String value) {
    put(key, value);
    return this;
  }
}
