package io.k8s.api.policy.v1.poddisruptionbudgetstatus;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class DisruptedPods extends LinkedHashMap<String, String> {
  public DisruptedPods kv(String key, String value) {
    put(key, value);
    return this;
  }
}
