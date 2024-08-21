package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 */
public class CinderPersistentVolumeSource {
  public String fsType;

  public Boolean readOnly;

  public SecretReference secretRef;

  public String volumeID;

  /**
   * fsType Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   */
  public CinderPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   */
  public CinderPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public CinderPersistentVolumeSource secretRef(SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   */
  public CinderPersistentVolumeSource volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }

  public static CinderPersistentVolumeSource cinderPersistentVolumeSource() {
    return new CinderPersistentVolumeSource();
  }
}
