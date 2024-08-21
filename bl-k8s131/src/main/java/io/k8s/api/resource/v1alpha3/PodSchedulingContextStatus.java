package io.k8s.api.resource.v1alpha3;

import java.util.List;

/**
 * PodSchedulingContextStatus describes where resources for the Pod can be allocated.
 */
public class PodSchedulingContextStatus {
  public List<ResourceClaimSchedulingStatus> resourceClaims;

  /**
   * ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding ResourceClaim uses &#34;WaitForFirstConsumer&#34; allocation mode.
   */
  public PodSchedulingContextStatus resourceClaims(
      List<ResourceClaimSchedulingStatus> resourceClaims) {
    this.resourceClaims = resourceClaims;
    return this;
  }

  public static PodSchedulingContextStatus podSchedulingContextStatus() {
    return new PodSchedulingContextStatus();
  }
}
