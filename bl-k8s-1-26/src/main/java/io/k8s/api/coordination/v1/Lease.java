
package io.k8s.api.coordination.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Lease defines a lease concept.
 * 
 */
public class Lease {

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
     * LeaseSpec is a specification of a Lease.
     * 
     */
    public LeaseSpec spec;

    public Lease withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Lease withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Lease withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Lease withSpec(LeaseSpec spec) {
        this.spec = spec;
        return this;
    }

}
