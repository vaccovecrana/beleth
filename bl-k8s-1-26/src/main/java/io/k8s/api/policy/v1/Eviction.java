
package io.k8s.api.policy.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.DeleteOptions;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Eviction evicts a pod from its node subject to certain policies and safety constraints. This is a subresource of Pod.  A request to cause such an eviction is created by POSTing to .../pods/<pod name>/evictions.
 * 
 */
public class Eviction {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * DeleteOptions may be provided when deleting an API object.
     * 
     */
    public DeleteOptions deleteOptions;
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

    public Eviction withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Eviction withDeleteOptions(DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
        return this;
    }

    public Eviction withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Eviction withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
