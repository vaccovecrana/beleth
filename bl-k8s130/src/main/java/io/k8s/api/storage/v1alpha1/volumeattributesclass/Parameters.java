package io.k8s.api.storage.v1alpha1.volumeattributesclass;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Parameters extends LinkedHashMap<String, String> {
  public Parameters kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Parameters parameters() {
    return new Parameters();
  }
}
