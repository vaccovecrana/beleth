package io.k8s.api.core.v1.nodestatus;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Allocatable extends LinkedHashMap<String, String> {
  public Allocatable kv(String key, String value) {
    put(key, value);
    return this;
  }
}
