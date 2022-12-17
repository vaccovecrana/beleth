
package io.k8s.api.autoscaling.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Scale represents a scaling request for a resource.
 * 
 */
public class Scale {

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
     * ScaleSpec describes the attributes of a scale subresource.
     * 
     */
    public ScaleSpec spec;
    /**
     * ScaleStatus represents the current status of a scale subresource.
     * 
     */
    public ScaleStatus status;

    public Scale withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Scale withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Scale withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Scale withSpec(ScaleSpec spec) {
        this.spec = spec;
        return this;
    }

    public Scale withStatus(ScaleStatus status) {
        this.status = status;
        return this;
    }

}
