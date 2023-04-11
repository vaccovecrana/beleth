package io.k8s.api.authentication.v1.userinfo;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;
import java.util.List;

@SuppressWarnings("serial")
public class Extra extends LinkedHashMap<String, List<String>> {
  public Extra kv(String key, List<String> value) {
    put(key, value);
    return this;
  }
}
