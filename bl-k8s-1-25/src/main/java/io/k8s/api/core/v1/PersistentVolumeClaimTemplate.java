package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;

/**
 * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
 */
public class PersistentVolumeClaimTemplate {
  public ObjectMeta metadata;

  public PersistentVolumeClaimSpec spec;

  public PersistentVolumeClaimTemplate metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public PersistentVolumeClaimTemplate spec(PersistentVolumeClaimSpec spec) {
    this.spec = spec;
    return this;
  }
}
