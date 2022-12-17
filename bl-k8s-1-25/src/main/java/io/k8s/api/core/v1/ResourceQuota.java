
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * ResourceQuota sets aggregate quota restrictions enforced per namespace
 * 
 */
public class ResourceQuota {

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
     * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
     * 
     */
    public ResourceQuotaSpec spec;
    /**
     * ResourceQuotaStatus defines the enforced hard limits and observed use.
     * 
     */
    public ResourceQuotaStatus status;

    public ResourceQuota withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ResourceQuota withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ResourceQuota withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ResourceQuota withSpec(ResourceQuotaSpec spec) {
        this.spec = spec;
        return this;
    }

    public ResourceQuota withStatus(ResourceQuotaStatus status) {
        this.status = status;
        return this;
    }

}
