
package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * IngressClass represents the class of the Ingress, referenced by the Ingress Spec. The `ingressclass.kubernetes.io/is-default-class` annotation can be used to indicate that an IngressClass should be considered default. When a single IngressClass resource has this annotation set to true, new Ingress resources without a class specified will be assigned this default class.
 * 
 */
public class IngressClass {

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
     * IngressClassSpec provides information about the class of an Ingress.
     * 
     */
    public IngressClassSpec spec;

    public IngressClass withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public IngressClass withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public IngressClass withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public IngressClass withSpec(IngressClassSpec spec) {
        this.spec = spec;
        return this;
    }

}
