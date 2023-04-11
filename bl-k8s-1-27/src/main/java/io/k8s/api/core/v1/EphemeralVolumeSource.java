package io.k8s.api.core.v1;

/**
 * Represents an ephemeral volume that is handled by a normal storage driver.
 */
public class EphemeralVolumeSource {
  public PersistentVolumeClaimTemplate volumeClaimTemplate;

  public EphemeralVolumeSource volumeClaimTemplate(
      PersistentVolumeClaimTemplate volumeClaimTemplate) {
    this.volumeClaimTemplate = volumeClaimTemplate;
    return this;
  }
}
