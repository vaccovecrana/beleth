
package io.k8s.api.batch.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * JobTemplateSpec describes the data a Job should have when created from a template
 * 
 */
public class JobTemplateSpec {

    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * JobSpec describes how the job execution will look like.
     * 
     */
    public JobSpec spec;

    public JobTemplateSpec withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public JobTemplateSpec withSpec(JobSpec spec) {
        this.spec = spec;
        return this;
    }

}
