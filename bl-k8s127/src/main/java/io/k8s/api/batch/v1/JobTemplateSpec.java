package io.k8s.api.batch.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;

/**
 * JobTemplateSpec describes the data a Job should have when created from a template
 */
public class JobTemplateSpec {
  public ObjectMeta metadata;

  public JobSpec spec;

  public JobTemplateSpec metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public JobTemplateSpec spec(JobSpec spec) {
    this.spec = spec;
    return this;
  }

  public static JobTemplateSpec jobTemplateSpec() {
    return new JobTemplateSpec();
  }
}
