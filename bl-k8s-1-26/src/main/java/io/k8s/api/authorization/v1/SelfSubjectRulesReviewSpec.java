package io.k8s.api.authorization.v1;

import java.lang.String;

/**
 * SelfSubjectRulesReviewSpec defines the specification for SelfSubjectRulesReview.
 */
public class SelfSubjectRulesReviewSpec {
  public String namespace;

  /**
   * Namespace to evaluate rules for. Required.
   */
  public SelfSubjectRulesReviewSpec namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
}
