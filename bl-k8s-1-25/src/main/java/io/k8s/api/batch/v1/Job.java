package io.k8s.api.batch.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Job represents the configuration of a single job.
 */
public class Job {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public JobSpec spec;

  public JobStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Job apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Job kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Job metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Job spec(JobSpec spec) {
    this.spec = spec;
    return this;
  }

  public Job status(JobStatus status) {
    this.status = status;
    return this;
  }
}
