package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 */
public class CephFSPersistentVolumeSource {
  public List<String> monitors;

  public String path;

  public Boolean readOnly;

  public String secretFile;

  public SecretReference secretRef;

  public String user;

  /**
   * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   */
  public CephFSPersistentVolumeSource monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  /**
   * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
   */
  public CephFSPersistentVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   */
  public CephFSPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   */
  public CephFSPersistentVolumeSource secretFile(String secretFile) {
    this.secretFile = secretFile;
    return this;
  }

  public CephFSPersistentVolumeSource secretRef(SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * user is Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   */
  public CephFSPersistentVolumeSource user(String user) {
    this.user = user;
    return this;
  }
}
