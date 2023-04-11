package io.k8s.api.core.v1;

import java.lang.Long;

/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 */
public class WeightedPodAffinityTerm {
  public PodAffinityTerm podAffinityTerm;

  public Long weight;

  public WeightedPodAffinityTerm podAffinityTerm(PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

  /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   */
  public WeightedPodAffinityTerm weight(Long weight) {
    this.weight = weight;
    return this;
  }
}
