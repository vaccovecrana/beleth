package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 */
public class GlusterfsVolumeSource {
  public String endpoints;

  public String path;

  public Boolean readOnly;

  /**
   * endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   */
  public GlusterfsVolumeSource endpoints(String endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   */
  public GlusterfsVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   */
  public GlusterfsVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }
}
