package io.k8s.apimachinery.pkg.apis.meta.v1.labelselector;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class MatchLabels extends LinkedHashMap<String, String> {
  public MatchLabels kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static MatchLabels matchLabels() {
    return new MatchLabels();
  }
}
