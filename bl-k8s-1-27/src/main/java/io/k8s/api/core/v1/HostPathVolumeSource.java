package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
 */
public class HostPathVolumeSource {
  public String path;

  public String type;

  /**
   * path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   */
  public HostPathVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * type for HostPath Volume Defaults to &#34;&#34; More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   */
  public HostPathVolumeSource type(String type) {
    this.type = type;
    return this;
  }
}
