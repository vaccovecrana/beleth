package io.k8s.api.admissionregistration.v1alpha1;

import java.lang.String;

/**
 * ValidatingAdmissionPolicyBindingSpec is the specification of the ValidatingAdmissionPolicyBinding.
 */
public class ValidatingAdmissionPolicyBindingSpec {
  public MatchResources matchResources;

  public ParamRef paramRef;

  public String policyName;

  public ValidatingAdmissionPolicyBindingSpec matchResources(MatchResources matchResources) {
    this.matchResources = matchResources;
    return this;
  }

  public ValidatingAdmissionPolicyBindingSpec paramRef(ParamRef paramRef) {
    this.paramRef = paramRef;
    return this;
  }

  /**
   * PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
   */
  public ValidatingAdmissionPolicyBindingSpec policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  public static ValidatingAdmissionPolicyBindingSpec validatingAdmissionPolicyBindingSpec() {
    return new ValidatingAdmissionPolicyBindingSpec();
  }
}
