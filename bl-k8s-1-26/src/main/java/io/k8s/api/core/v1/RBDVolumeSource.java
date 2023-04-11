package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
 */
public class RBDVolumeSource {
  public String fsType;

  public String image;

  public String keyring;

  public List<String> monitors;

  public String pool;

  public Boolean readOnly;

  public LocalObjectReference secretRef;

  public String user;

  /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
   */
  public RBDVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   */
  public RBDVolumeSource image(String image) {
    this.image = image;
    return this;
  }

  /**
   * keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   */
  public RBDVolumeSource keyring(String keyring) {
    this.keyring = keyring;
    return this;
  }

  /**
   * monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   */
  public RBDVolumeSource monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  /**
   * pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   */
  public RBDVolumeSource pool(String pool) {
    this.pool = pool;
    return this;
  }

  /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   */
  public RBDVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public RBDVolumeSource secretRef(LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   */
  public RBDVolumeSource user(String user) {
    this.user = user;
    return this;
  }
}
