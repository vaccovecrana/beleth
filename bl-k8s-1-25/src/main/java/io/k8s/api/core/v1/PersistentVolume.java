package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
 */
public class PersistentVolume {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public PersistentVolumeSpec spec;

  public PersistentVolumeStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PersistentVolume apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PersistentVolume kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PersistentVolume metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public PersistentVolume spec(PersistentVolumeSpec spec) {
    this.spec = spec;
    return this;
  }

  public PersistentVolume status(PersistentVolumeStatus status) {
    this.status = status;
    return this;
  }
}
