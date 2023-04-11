package io.k8s.api.core.v1.configmap;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Data extends LinkedHashMap<String, String> {
  public Data kv(String key, String value) {
    put(key, value);
    return this;
  }
}
