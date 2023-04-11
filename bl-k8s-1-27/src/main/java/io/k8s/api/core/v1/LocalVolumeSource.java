package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Local represents directly-attached storage with node affinity (Beta feature)
 */
public class LocalVolumeSource {
  public String fsType;

  public String path;

  /**
   * fsType is the filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default value is to auto-select a filesystem if unspecified.
   */
  public LocalVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * path of the full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
   */
  public LocalVolumeSource path(String path) {
    this.path = path;
    return this;
  }
}
