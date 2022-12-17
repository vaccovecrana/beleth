
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Pod is a collection of containers that can run on a host. This resource is created by clients and scheduled onto hosts.
 * 
 */
public class Pod {

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
     * PodSpec is a description of a pod.
     * 
     */
    public PodSpec spec;
    /**
     * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
     * 
     */
    public PodStatus status;

    public Pod withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Pod withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Pod withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Pod withSpec(PodSpec spec) {
        this.spec = spec;
        return this;
    }

    public Pod withStatus(PodStatus status) {
        this.status = status;
        return this;
    }

}
