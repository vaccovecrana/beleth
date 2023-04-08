
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
 * 
 */
public class PersistentVolume {

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
     * PersistentVolumeSpec is the specification of a persistent volume.
     * 
     */
    public PersistentVolumeSpec spec;
    /**
     * PersistentVolumeStatus is the current status of a persistent volume.
     * 
     */
    public PersistentVolumeStatus status;

    public PersistentVolume withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PersistentVolume withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public PersistentVolume withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PersistentVolume withSpec(PersistentVolumeSpec spec) {
        this.spec = spec;
        return this;
    }

    public PersistentVolume withStatus(PersistentVolumeStatus status) {
        this.status = status;
        return this;
    }

}
