package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 */
public class GlusterfsPersistentVolumeSource {
  public String endpoints;

  public String endpointsNamespace;

  public String path;

  public Boolean readOnly;

  /**
   * endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   */
  public GlusterfsPersistentVolumeSource endpoints(String endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   */
  public GlusterfsPersistentVolumeSource endpointsNamespace(String endpointsNamespace) {
    this.endpointsNamespace = endpointsNamespace;
    return this;
  }

  /**
   * path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   */
  public GlusterfsPersistentVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   */
  public GlusterfsPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }
}
