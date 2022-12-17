
package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * APIService represents a server for a particular GroupVersion. Name must be "version.group".
 * 
 */
public class APIService {

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
     * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
     * 
     */
    public APIServiceSpec spec;
    /**
     * APIServiceStatus contains derived information about an API server
     * 
     */
    public APIServiceStatus status;

    public APIService withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIService withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public APIService withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public APIService withSpec(APIServiceSpec spec) {
        this.spec = spec;
        return this;
    }

    public APIService withStatus(APIServiceStatus status) {
        this.status = status;
        return this;
    }

}
