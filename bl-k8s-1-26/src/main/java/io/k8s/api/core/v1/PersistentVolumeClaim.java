package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * PersistentVolumeClaim is a user&#39;s request for and claim to a persistent volume
 */
public class PersistentVolumeClaim {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public PersistentVolumeClaimSpec spec;

  public PersistentVolumeClaimStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PersistentVolumeClaim apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PersistentVolumeClaim kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PersistentVolumeClaim metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public PersistentVolumeClaim spec(PersistentVolumeClaimSpec spec) {
    this.spec = spec;
    return this;
  }

  public PersistentVolumeClaim status(PersistentVolumeClaimStatus status) {
    this.status = status;
    return this;
  }
}
