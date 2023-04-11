package io.k8s.api.core.v1.resourcequotastatus;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Used extends LinkedHashMap<String, String> {
  public Used kv(String key, String value) {
    put(key, value);
    return this;
  }
}
