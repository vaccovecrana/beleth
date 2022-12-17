
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * PersistentVolumeClaim is a user's request for and claim to a persistent volume
 * 
 */
public class PersistentVolumeClaim {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
     * 
     */
    public PersistentVolumeClaimSpec spec;
    /**
     * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
     * 
     */
    public PersistentVolumeClaimStatus status;

    public PersistentVolumeClaim withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PersistentVolumeClaim withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public PersistentVolumeClaim withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PersistentVolumeClaim withSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    public PersistentVolumeClaim withStatus(PersistentVolumeClaimStatus status) {
        this.status = status;
        return this;
    }

}
