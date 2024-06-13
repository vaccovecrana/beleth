package io.k8s.api.core.v1.volumeresourcerequirements;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Requests extends LinkedHashMap<String, String> {
  public Requests kv(String key, String value) {
    put(key, value);
    return this;
  }
}
