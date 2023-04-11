package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 */
public class FCVolumeSource {
  public String fsType;

  public Long lun;

  public Boolean readOnly;

  public List<String> targetWWNs;

  public List<String> wwids;

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
   */
  public FCVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * lun is Optional: FC target lun number
   */
  public FCVolumeSource lun(Long lun) {
    this.lun = lun;
    return this;
  }

  /**
   * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public FCVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * targetWWNs is Optional: FC target worldwide names (WWNs)
   */
  public FCVolumeSource targetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
    return this;
  }

  /**
   * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
   */
  public FCVolumeSource wwids(List<String> wwids) {
    this.wwids = wwids;
    return this;
  }
}
