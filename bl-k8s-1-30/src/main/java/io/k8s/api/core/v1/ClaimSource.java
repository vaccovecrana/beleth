package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ClaimSource describes a reference to a ResourceClaim.
 *
 * Exactly one of these fields should be set.  Consumers of this type must treat an empty object as if it has an unknown value.
 */
public class ClaimSource {
  public String resourceClaimName;

  public String resourceClaimTemplateName;

  /**
   * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
   */
  public ClaimSource resourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return this;
  }

  /**
   * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
   *
   * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.
   *
   * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
   */
  public ClaimSource resourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName = resourceClaimTemplateName;
    return this;
  }
}
