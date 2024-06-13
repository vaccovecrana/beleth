package io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Labels extends LinkedHashMap<String, String> {
  public Labels kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Labels labels() {
    return new Labels();
  }
}
