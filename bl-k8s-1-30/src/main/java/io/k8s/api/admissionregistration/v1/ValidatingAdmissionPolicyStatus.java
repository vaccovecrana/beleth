package io.k8s.api.admissionregistration.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;
import java.lang.Long;
import java.util.List;

/**
 * ValidatingAdmissionPolicyStatus represents the status of an admission validation policy.
 */
public class ValidatingAdmissionPolicyStatus {
  public List<Condition> conditions;

  public Long observedGeneration;

  public TypeChecking typeChecking;

  /**
   * The conditions represent the latest available observations of a policy&#39;s current state.
   */
  public ValidatingAdmissionPolicyStatus conditions(List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The generation observed by the controller.
   */
  public ValidatingAdmissionPolicyStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  public ValidatingAdmissionPolicyStatus typeChecking(TypeChecking typeChecking) {
    this.typeChecking = typeChecking;
    return this;
  }
}
