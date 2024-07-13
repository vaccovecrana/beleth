package io.k8s.api.core.v1.secret;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Data extends LinkedHashMap<String, String> {
  public Data kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Data data() {
    return new Data();
  }
}
