package io.k8s.api.resource.v1alpha2;

import java.lang.String;
import java.util.List;

/**
 * ResourceClaimSchedulingStatus contains information about one particular ResourceClaim with &#34;WaitForFirstConsumer&#34; allocation mode.
 */
public class ResourceClaimSchedulingStatus {
  public String name;

  public List<String> unsuitableNodes;

  /**
   * Name matches the pod.spec.resourceClaims[<code>*</code>].Name field.
   */
  public ResourceClaimSchedulingStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UnsuitableNodes lists nodes that the ResourceClaim cannot be allocated for.
   *
   * The size of this field is limited to 128, the same as for PodSchedulingSpec.PotentialNodes. This may get increased in the future, but not reduced.
   */
  public ResourceClaimSchedulingStatus unsuitableNodes(List<String> unsuitableNodes) {
    this.unsuitableNodes = unsuitableNodes;
    return this;
  }
}
