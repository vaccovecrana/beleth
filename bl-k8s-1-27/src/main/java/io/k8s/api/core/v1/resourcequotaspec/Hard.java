package io.k8s.api.core.v1.resourcequotaspec;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Hard extends LinkedHashMap<String, String> {
  public Hard kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Hard hard() {
    return new Hard();
  }
}
