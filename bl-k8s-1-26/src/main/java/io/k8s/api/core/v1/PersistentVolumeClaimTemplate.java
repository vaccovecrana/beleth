
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
 * 
 */
public class PersistentVolumeClaimTemplate {

    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
     * (Required)
     * 
     */
    public PersistentVolumeClaimSpec spec;

    public PersistentVolumeClaimTemplate withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PersistentVolumeClaimTemplate withSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

}
