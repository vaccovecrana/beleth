
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * PodTemplateSpec describes the data a pod should have when created from a template
 * 
 */
public class PodTemplateSpec {

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

    public PodTemplateSpec withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PodTemplateSpec withSpec(PodSpec spec) {
        this.spec = spec;
        return this;
    }

}
