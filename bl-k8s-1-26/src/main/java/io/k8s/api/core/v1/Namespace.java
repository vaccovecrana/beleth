
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Namespace provides a scope for Names. Use of multiple namespaces is optional.
 * 
 */
public class Namespace {

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
     * NamespaceSpec describes the attributes on a Namespace.
     * 
     */
    public NamespaceSpec spec;
    /**
     * NamespaceStatus is information about the current status of a Namespace.
     * 
     */
    public NamespaceStatus status;

    public Namespace withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Namespace withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Namespace withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Namespace withSpec(NamespaceSpec spec) {
        this.spec = spec;
        return this;
    }

    public Namespace withStatus(NamespaceStatus status) {
        this.status = status;
        return this;
    }

}
