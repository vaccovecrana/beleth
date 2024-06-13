package io.k8s.api.admissionregistration.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ValidatingAdmissionPolicyBinding binds the ValidatingAdmissionPolicy with paramerized resources. ValidatingAdmissionPolicyBinding and parameter CRDs together define how cluster administrators configure policies for clusters.
 *
 * For a given admission request, each binding will cause its policy to be evaluated N times, where N is 1 for policies/bindings that don&#39;t use params, otherwise N is the number of parameters selected by the binding.
 *
 * The CEL expressions of a policy must have a computed CEL cost below the maximum CEL budget. Each evaluation of the policy is given an independent CEL cost budget. Adding/removing policies, bindings, or params can not affect whether a given (policy, binding, param) combination is within its own CEL budget.
 */
public class ValidatingAdmissionPolicyBinding {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ValidatingAdmissionPolicyBindingSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ValidatingAdmissionPolicyBinding apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ValidatingAdmissionPolicyBinding kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ValidatingAdmissionPolicyBinding metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ValidatingAdmissionPolicyBinding spec(ValidatingAdmissionPolicyBindingSpec spec) {
    this.spec = spec;
    return this;
  }
}
