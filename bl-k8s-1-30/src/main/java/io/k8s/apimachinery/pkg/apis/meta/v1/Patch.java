package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Patch extends LinkedHashMap<String, Object> {
  public Patch kv(String key, Object value) {
    put(key, value);
    return this;
  }
}
