package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
 */
public class NFSVolumeSource {
  public String path;

  public Boolean readOnly;

  public String server;

  /**
   * path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   */
  public NFSVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   */
  public NFSVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   */
  public NFSVolumeSource server(String server) {
    this.server = server;
    return this;
  }
}
