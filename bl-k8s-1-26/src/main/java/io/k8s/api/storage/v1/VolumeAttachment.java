
package io.k8s.api.storage.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
 * 
 * VolumeAttachment objects are non-namespaced.
 * 
 */
public class VolumeAttachment {

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
     * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
     * (Required)
     * 
     */
    public VolumeAttachmentSpec spec;
    /**
     * VolumeAttachmentStatus is the status of a VolumeAttachment request.
     * 
     */
    public VolumeAttachmentStatus status;

    public VolumeAttachment withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public VolumeAttachment withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public VolumeAttachment withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public VolumeAttachment withSpec(VolumeAttachmentSpec spec) {
        this.spec = spec;
        return this;
    }

    public VolumeAttachment withStatus(VolumeAttachmentStatus status) {
        this.status = status;
        return this;
    }

}
