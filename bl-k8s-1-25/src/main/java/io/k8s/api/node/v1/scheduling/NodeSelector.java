package io.k8s.api.node.v1.scheduling;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class NodeSelector extends LinkedHashMap<String, String> {
  public NodeSelector kv(String key, String value) {
    put(key, value);
    return this;
  }
}
