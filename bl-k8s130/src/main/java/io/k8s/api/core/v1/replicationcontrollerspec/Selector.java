package io.k8s.api.core.v1.replicationcontrollerspec;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Selector extends LinkedHashMap<String, String> {
  public Selector kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static Selector selector() {
    return new Selector();
  }
}
