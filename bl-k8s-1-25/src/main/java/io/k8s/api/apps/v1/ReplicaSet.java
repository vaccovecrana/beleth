
package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
 * 
 */
public class ReplicaSet {

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
     * ReplicaSetSpec is the specification of a ReplicaSet.
     * 
     */
    public ReplicaSetSpec spec;
    /**
     * ReplicaSetStatus represents the current status of a ReplicaSet.
     * 
     */
    public ReplicaSetStatus status;

    public ReplicaSet withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ReplicaSet withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ReplicaSet withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ReplicaSet withSpec(ReplicaSetSpec spec) {
        this.spec = spec;
        return this;
    }

    public ReplicaSet withStatus(ReplicaSetStatus status) {
        this.status = status;
        return this;
    }

}
