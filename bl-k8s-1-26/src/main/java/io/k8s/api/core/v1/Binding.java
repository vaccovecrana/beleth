
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Binding ties one object to another; for example, a pod is bound to a node by a scheduler. Deprecated in 1.7, please use the bindings subresource of pods instead.
 * 
 */
public class Binding {

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
     * ObjectReference contains enough information to let you inspect or modify the referred object.
     * (Required)
     * 
     */
    public ObjectReference target;

    public Binding withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Binding withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Binding withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Binding withTarget(ObjectReference target) {
        this.target = target;
        return this;
    }

}
