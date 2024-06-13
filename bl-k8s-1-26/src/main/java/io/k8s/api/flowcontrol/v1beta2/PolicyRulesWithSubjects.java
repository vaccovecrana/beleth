package io.k8s.api.flowcontrol.v1beta2;

import java.util.List;

/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 */
public class PolicyRulesWithSubjects {
  public List<NonResourcePolicyRule> nonResourceRules;

  public List<ResourcePolicyRule> resourceRules;

  public List<Subject> subjects;

  /**
   * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
   */
  public PolicyRulesWithSubjects nonResourceRules(List<NonResourcePolicyRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
    return this;
  }

  /**
   * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
   */
  public PolicyRulesWithSubjects resourceRules(List<ResourcePolicyRule> resourceRules) {
    this.resourceRules = resourceRules;
    return this;
  }

  /**
   * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
   */
  public PolicyRulesWithSubjects subjects(List<Subject> subjects) {
    this.subjects = subjects;
    return this;
  }

  public static PolicyRulesWithSubjects policyRulesWithSubjects() {
    return new PolicyRulesWithSubjects();
  }
}
