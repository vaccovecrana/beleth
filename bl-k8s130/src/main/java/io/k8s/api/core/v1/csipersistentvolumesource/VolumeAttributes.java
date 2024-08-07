package io.k8s.api.core.v1.csipersistentvolumesource;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class VolumeAttributes extends LinkedHashMap<String, String> {
  public VolumeAttributes kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static VolumeAttributes volumeAttributes() {
    return new VolumeAttributes();
  }
}
