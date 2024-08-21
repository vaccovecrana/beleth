package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PodResourceClaimStatus is stored in the PodStatus for each PodResourceClaim which references a ResourceClaimTemplate. It stores the generated name for the corresponding ResourceClaim.
 */
public class PodResourceClaimStatus {
  public String name;

  public String resourceClaimName;

  /**
   * Name uniquely identifies this resource claim inside the pod. This must match the name of an entry in pod.spec.resourceClaims, which implies that the string must be a DNS_LABEL.
   */
  public PodResourceClaimStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ResourceClaimName is the name of the ResourceClaim that was generated for the Pod in the namespace of the Pod. If this is unset, then generating a ResourceClaim was not necessary. The pod.spec.resourceClaims entry can be ignored in this case.
   */
  public PodResourceClaimStatus resourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return this;
  }

  public static PodResourceClaimStatus podResourceClaimStatus() {
    return new PodResourceClaimStatus();
  }
}
