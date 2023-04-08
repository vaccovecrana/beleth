
package io.k8s.api.batch.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Job represents the configuration of a single job.
 * 
 */
public class Job {

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
     * JobSpec describes how the job execution will look like.
     * 
     */
    public JobSpec spec;
    /**
     * JobStatus represents the current state of a Job.
     * 
     */
    public JobStatus status;

    public Job withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Job withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Job withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Job withSpec(JobSpec spec) {
        this.spec = spec;
        return this;
    }

    public Job withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

}
