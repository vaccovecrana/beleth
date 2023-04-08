
package io.k8s.api.storage.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * CSIDriver captures information about a Container Storage Interface (CSI) volume driver deployed on the cluster. Kubernetes attach detach controller uses this object to determine whether attach is required. Kubelet uses this object to determine whether pod information needs to be passed on mount. CSIDriver objects are non-namespaced.
 * 
 */
public class CSIDriver {

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
     * CSIDriverSpec is the specification of a CSIDriver.
     * (Required)
     * 
     */
    public CSIDriverSpec spec;

    public CSIDriver withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CSIDriver withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public CSIDriver withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CSIDriver withSpec(CSIDriverSpec spec) {
        this.spec = spec;
        return this;
    }

}
