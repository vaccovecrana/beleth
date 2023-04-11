package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 */
public class CinderVolumeSource {
  public String fsType;

  public Boolean readOnly;

  public LocalObjectReference secretRef;

  public String volumeID;

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   */
  public CinderVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   */
  public CinderVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public CinderVolumeSource secretRef(LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   */
  public CinderVolumeSource volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }
}
