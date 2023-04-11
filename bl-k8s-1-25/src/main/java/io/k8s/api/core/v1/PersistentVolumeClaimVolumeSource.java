package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * PersistentVolumeClaimVolumeSource references the user&#39;s PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
 */
public class PersistentVolumeClaimVolumeSource {
  public String claimName;

  public Boolean readOnly;

  /**
   * claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   */
  public PersistentVolumeClaimVolumeSource claimName(String claimName) {
    this.claimName = claimName;
    return this;
  }

  /**
   * readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
   */
  public PersistentVolumeClaimVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }
}
