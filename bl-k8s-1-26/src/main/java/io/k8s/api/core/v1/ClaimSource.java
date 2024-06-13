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
   * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be &#60;pod name&#62;-&#60;resource name&#62;, where &#60;resource name&#62; is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).
   *
   * An existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.
   *
   * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
   */
  public ClaimSource resourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName = resourceClaimTemplateName;
    return this;
  }

  public static ClaimSource claimSource() {
    return new ClaimSource();
  }
}
