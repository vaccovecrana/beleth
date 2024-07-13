package io.k8s.api.storage.v1.volumeattachmentstatus;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class AttachmentMetadata extends LinkedHashMap<String, String> {
  public AttachmentMetadata kv(String key, String value) {
    put(key, value);
    return this;
  }

  public static AttachmentMetadata attachmentMetadata() {
    return new AttachmentMetadata();
  }
}
