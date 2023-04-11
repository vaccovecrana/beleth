package io.k8s.api.batch.v1;

import java.util.List;

/**
 * PodFailurePolicy describes how failed pods influence the backoffLimit.
 */
public class PodFailurePolicy {
  public List<PodFailurePolicyRule> rules;

  /**
   * A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
   */
  public PodFailurePolicy rules(List<PodFailurePolicyRule> rules) {
    this.rules = rules;
    return this;
  }
}
