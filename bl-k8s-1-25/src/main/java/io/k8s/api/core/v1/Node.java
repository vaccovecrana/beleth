
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Node is a worker node in Kubernetes. Each node will have a unique identifier in the cache (i.e. in etcd).
 * 
 */
public class Node {

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
     * NodeSpec describes the attributes that a node is created with.
     * 
     */
    public NodeSpec spec;
    /**
     * NodeStatus is information about the current status of a node.
     * 
     */
    public NodeStatus status;

    public Node withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Node withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Node withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Node withSpec(NodeSpec spec) {
        this.spec = spec;
        return this;
    }

    public Node withStatus(NodeStatus status) {
        this.status = status;
        return this;
    }

}
