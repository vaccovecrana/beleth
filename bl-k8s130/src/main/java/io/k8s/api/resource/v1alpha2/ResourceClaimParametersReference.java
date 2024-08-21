package io.k8s.api.resource.v1alpha2;

import java.lang.String;

/**
 * ResourceClaimParametersReference contains enough information to let you locate the parameters for a ResourceClaim. The object must be in the same namespace as the ResourceClaim.
 */
public class ResourceClaimParametersReference {
  public String apiGroup;

  public String kind;

  public String name;

  /**
   * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
   */
  public ResourceClaimParametersReference apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata, for example &#34;ConfigMap&#34;.
   */
  public ResourceClaimParametersReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name is the name of resource being referenced.
   */
  public ResourceClaimParametersReference name(String name) {
    this.name = name;
    return this;
  }

  public static ResourceClaimParametersReference resourceClaimParametersReference() {
    return new ResourceClaimParametersReference();
  }
}
