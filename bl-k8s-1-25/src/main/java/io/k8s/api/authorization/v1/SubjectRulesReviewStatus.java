package io.k8s.api.authorization.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it&#39;s safe to assume the subject has that permission, even if that list is incomplete.
 */
public class SubjectRulesReviewStatus {
  public String evaluationError;

  public Boolean incomplete;

  public List<NonResourceRule> nonResourceRules;

  public List<ResourceRule> resourceRules;

  /**
   * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn&#39;t support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
   */
  public SubjectRulesReviewStatus evaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
    return this;
  }

  /**
   * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn&#39;t support rules evaluation.
   */
  public SubjectRulesReviewStatus incomplete(Boolean incomplete) {
    this.incomplete = incomplete;
    return this;
  }

  /**
   * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   */
  public SubjectRulesReviewStatus nonResourceRules(List<NonResourceRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
    return this;
  }

  /**
   * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   */
  public SubjectRulesReviewStatus resourceRules(List<ResourceRule> resourceRules) {
    this.resourceRules = resourceRules;
    return this;
  }
}
