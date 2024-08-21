package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PodResourceClaim references exactly one ResourceClaim, either directly or by naming a ResourceClaimTemplate which is then turned into a ResourceClaim for the pod.
 *
 * It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
 */
public class PodResourceClaim {
  public String name;

  public String resourceClaimName;

  public String resourceClaimTemplateName;

  /**
   * Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
   */
  public PodResourceClaim name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
   *
   * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
   */
  public PodResourceClaim resourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return this;
  }

  /**
   * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
   *
   * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.
   *
   * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
   *
   * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
   */
  public PodResourceClaim resourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName = resourceClaimTemplateName;
    return this;
  }

  public static PodResourceClaim podResourceClaim() {
    return new PodResourceClaim();
  }
}
