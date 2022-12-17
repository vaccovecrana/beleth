
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * PodTemplate describes a template for creating copies of a predefined pod.
 * 
 */
public class PodTemplate {

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
     * PodTemplateSpec describes the data a pod should have when created from a template
     * 
     */
    public PodTemplateSpec template;

    public PodTemplate withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PodTemplate withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public PodTemplate withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PodTemplate withTemplate(PodTemplateSpec template) {
        this.template = template;
        return this;
    }

}
