package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;

/**
 * Maps a string key to a path within a volume.
 */
public class KeyToPath {
  public String key;

  public Long mode;

  public String path;

  /**
   * key is the key to project.
   */
  public KeyToPath key(String key) {
    this.key = key;
    return this;
  }

  /**
   * mode is Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   */
  public KeyToPath mode(Long mode) {
    this.mode = mode;
    return this;
  }

  /**
   * path is the relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
   */
  public KeyToPath path(String path) {
    this.path = path;
    return this;
  }
}
