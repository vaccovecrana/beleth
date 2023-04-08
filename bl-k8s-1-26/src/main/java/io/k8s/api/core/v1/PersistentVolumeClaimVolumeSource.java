
package io.k8s.api.core.v1;



/**
 * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
 * 
 */
public class PersistentVolumeClaimVolumeSource {

    /**
     * claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * (Required)
     * 
     */
    public String claimName;
    /**
     * readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
     * 
     */
    public Boolean readOnly;

    public PersistentVolumeClaimVolumeSource withClaimName(String claimName) {
        this.claimName = claimName;
        return this;
    }

    public PersistentVolumeClaimVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

}
