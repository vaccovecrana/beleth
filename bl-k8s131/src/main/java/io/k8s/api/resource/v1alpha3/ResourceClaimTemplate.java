package io.k8s.api.resource.v1alpha3;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ResourceClaimTemplate is used to produce ResourceClaim objects.
 *
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
public class ResourceClaimTemplate {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ResourceClaimTemplateSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ResourceClaimTemplate apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ResourceClaimTemplate kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ResourceClaimTemplate metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ResourceClaimTemplate spec(ResourceClaimTemplateSpec spec) {
    this.spec = spec;
    return this;
  }

  public static ResourceClaimTemplate resourceClaimTemplate() {
    return new ResourceClaimTemplate();
  }
}
