package io.k8s.api.core.v1.limitrangeitem;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class MaxLimitRequestRatio extends LinkedHashMap<String, String> {
  public MaxLimitRequestRatio kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static MaxLimitRequestRatio maxLimitRequestRatio() {
    return new MaxLimitRequestRatio();
  }
}
