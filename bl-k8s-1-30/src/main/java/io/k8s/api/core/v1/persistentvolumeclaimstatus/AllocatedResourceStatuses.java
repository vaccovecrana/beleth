package io.k8s.api.core.v1.persistentvolumeclaimstatus;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class AllocatedResourceStatuses extends LinkedHashMap<String, String> {
  public AllocatedResourceStatuses kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static AllocatedResourceStatuses allocatedResourceStatuses() {
    return new AllocatedResourceStatuses();
  }
}
