package io.k8s.api.admissionregistration.v1alpha1;

import java.lang.String;
import java.util.List;

/**
 * ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.
 */
public class ValidatingAdmissionPolicySpec {
  public String failurePolicy;

  public MatchResources matchConstraints;

  public ParamKind paramKind;

  public List<Validation> validations;

  /**
   * FailurePolicy defines how to handle failures for the admission policy. Failures can occur from invalid or mis-configured policy definitions or bindings. A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource. Allowed values are Ignore or Fail. Defaults to Fail.
   */
  public ValidatingAdmissionPolicySpec failurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

  public ValidatingAdmissionPolicySpec matchConstraints(MatchResources matchConstraints) {
    this.matchConstraints = matchConstraints;
    return this;
  }

  public ValidatingAdmissionPolicySpec paramKind(ParamKind paramKind) {
    this.paramKind = paramKind;
    return this;
  }

  /**
   * Validations contain CEL expressions which is used to apply the validation. A minimum of one validation is required for a policy definition. Required.
   */
  public ValidatingAdmissionPolicySpec validations(List<Validation> validations) {
    this.validations = validations;
    return this;
  }
}
