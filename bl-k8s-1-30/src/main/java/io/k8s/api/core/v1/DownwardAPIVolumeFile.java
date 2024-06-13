package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;

/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 */
public class DownwardAPIVolumeFile {
  public ObjectFieldSelector fieldRef;

  public Long mode;

  public String path;

  public ResourceFieldSelector resourceFieldRef;

  public DownwardAPIVolumeFile fieldRef(ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

  /**
   * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   */
  public DownwardAPIVolumeFile mode(Long mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
   */
  public DownwardAPIVolumeFile path(String path) {
    this.path = path;
    return this;
  }

  public DownwardAPIVolumeFile resourceFieldRef(ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }
}
