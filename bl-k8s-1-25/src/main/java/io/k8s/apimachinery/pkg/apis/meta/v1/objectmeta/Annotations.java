package io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Annotations extends LinkedHashMap<String, String> {
  public Annotations kv(String key, String value) {
    put(key, value);
    return this;
  }
}
