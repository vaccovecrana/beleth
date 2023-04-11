package io.k8s.api.resource.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ResourceClaim describes which resources are needed by a resource consumer. Its status tracks whether the resource has been allocated and what the resulting attributes are.
 *
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
public class ResourceClaim {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ResourceClaimSpec spec;

  public ResourceClaimStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ResourceClaim apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ResourceClaim kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ResourceClaim metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ResourceClaim spec(ResourceClaimSpec spec) {
    this.spec = spec;
    return this;
  }

  public ResourceClaim status(ResourceClaimStatus status) {
    this.status = status;
    return this;
  }
}
