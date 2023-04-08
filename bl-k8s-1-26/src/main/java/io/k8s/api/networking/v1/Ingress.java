
package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
 * 
 */
public class Ingress {

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
     * IngressSpec describes the Ingress the user wishes to exist.
     * 
     */
    public IngressSpec spec;
    /**
     * IngressStatus describe the current state of the Ingress.
     * 
     */
    public IngressStatus status;

    public Ingress withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Ingress withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Ingress withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Ingress withSpec(IngressSpec spec) {
        this.spec = spec;
        return this;
    }

    public Ingress withStatus(IngressStatus status) {
        this.status = status;
        return this;
    }

}
