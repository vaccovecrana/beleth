
package io.k8s.api.core.v1;



/**
 * Represents an ephemeral volume that is handled by a normal storage driver.
 * 
 */
public class EphemeralVolumeSource {

    /**
     * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
     * 
     */
    public PersistentVolumeClaimTemplate volumeClaimTemplate;

    public EphemeralVolumeSource withVolumeClaimTemplate(PersistentVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
        return this;
    }

}
