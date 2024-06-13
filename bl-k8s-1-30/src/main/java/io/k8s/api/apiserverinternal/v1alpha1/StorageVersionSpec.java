package io.k8s.api.apiserverinternal.v1alpha1;

import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class StorageVersionSpec extends LinkedHashMap<String, Object> {
  public StorageVersionSpec kv(String key, Object value) {
    put(key, value);
    return this;
  }
}
