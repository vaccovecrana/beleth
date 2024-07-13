package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;

/**
 * PodTemplateSpec describes the data a pod should have when created from a template
 */
public class PodTemplateSpec {
  public ObjectMeta metadata;

  public PodSpec spec;

  public PodTemplateSpec metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public PodTemplateSpec spec(PodSpec spec) {
    this.spec = spec;
    return this;
  }

  public static PodTemplateSpec podTemplateSpec() {
    return new PodTemplateSpec();
  }
}
