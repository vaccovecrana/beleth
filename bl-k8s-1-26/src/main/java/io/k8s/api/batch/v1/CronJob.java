package io.k8s.api.batch.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * CronJob represents the configuration of a single cron job.
 */
public class CronJob {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public CronJobSpec spec;

  public CronJobStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public CronJob apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public CronJob kind(String kind) {
    this.kind = kind;
    return this;
  }

  public CronJob metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public CronJob spec(CronJobSpec spec) {
    this.spec = spec;
    return this;
  }

  public CronJob status(CronJobStatus status) {
    this.status = status;
    return this;
  }
}
