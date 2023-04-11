package io.k8s.api.resource.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;

/**
 * ResourceClaimTemplateSpec contains the metadata and fields for a ResourceClaim.
 */
public class ResourceClaimTemplateSpec {
  public ObjectMeta metadata;

  public ResourceClaimSpec spec;

  public ResourceClaimTemplateSpec metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ResourceClaimTemplateSpec spec(ResourceClaimSpec spec) {
    this.spec = spec;
    return this;
  }
}
