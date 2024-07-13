package io.k8s.api.core.v1.persistentvolumeclaimstatus;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class AllocatedResources extends LinkedHashMap<String, String> {
  public AllocatedResources kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static AllocatedResources allocatedResources() {
    return new AllocatedResources();
  }
}
