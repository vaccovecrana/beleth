package io.k8s.api.core.v1.volumeresourcerequirements;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Limits extends LinkedHashMap<String, String> {
  public Limits kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Limits limits() {
    return new Limits();
  }
}
