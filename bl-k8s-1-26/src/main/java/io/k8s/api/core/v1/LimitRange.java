
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * LimitRange sets resource usage limits for each kind of resource in a Namespace.
 * 
 */
public class LimitRange {

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
     * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
     * 
     */
    public LimitRangeSpec spec;

    public LimitRange withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public LimitRange withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public LimitRange withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public LimitRange withSpec(LimitRangeSpec spec) {
        this.spec = spec;
        return this;
    }

}
