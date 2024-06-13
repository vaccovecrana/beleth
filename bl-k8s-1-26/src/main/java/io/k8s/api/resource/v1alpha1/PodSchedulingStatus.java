package io.k8s.api.resource.v1alpha1;

import java.util.List;

/**
 * PodSchedulingStatus describes where resources for the Pod can be allocated.
 */
public class PodSchedulingStatus {
  public List<ResourceClaimSchedulingStatus> resourceClaims;

  /**
   * ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding ResourceClaim uses &#34;WaitForFirstConsumer&#34; allocation mode.
   */
  public PodSchedulingStatus resourceClaims(List<ResourceClaimSchedulingStatus> resourceClaims) {
    this.resourceClaims = resourceClaims;
    return this;
  }

  public static PodSchedulingStatus podSchedulingStatus() {
    return new PodSchedulingStatus();
  }
}
