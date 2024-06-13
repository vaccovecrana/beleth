package io.k8s.api.node.v1.overhead;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class PodFixed extends LinkedHashMap<String, String> {
  public PodFixed kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static PodFixed podFixed() {
    return new PodFixed();
  }
}
