package io.k8s.api.batch.v1;

import java.util.List;

/**
 * SuccessPolicy describes when a Job can be declared as succeeded based on the success of some indexes.
 */
public class SuccessPolicy {
  public List<SuccessPolicyRule> rules;

  /**
   * rules represents the list of alternative rules for the declaring the Jobs as successful before `.status.succeeded &#62;= .spec.completions`. Once any of the rules are met, the &#34;SucceededCriteriaMet&#34; condition is added, and the lingering pods are removed. The terminal state for such a Job has the &#34;Complete&#34; condition. Additionally, these rules are evaluated in order; Once the Job meets one of the rules, other rules are ignored. At most 20 elements are allowed.
   */
  public SuccessPolicy rules(List<SuccessPolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  public static SuccessPolicy successPolicy() {
    return new SuccessPolicy();
  }
}
