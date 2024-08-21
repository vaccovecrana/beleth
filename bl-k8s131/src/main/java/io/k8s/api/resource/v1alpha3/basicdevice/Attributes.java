package io.k8s.api.resource.v1alpha3.basicdevice;

import io.k8s.api.resource.v1alpha3.DeviceAttribute;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class Attributes extends LinkedHashMap<String, DeviceAttribute> {
  public Attributes kv(String key, DeviceAttribute value) {
    put(key, value);
    return this;
  }

  public static Attributes attributes() {
    return new Attributes();
  }
}
