package io.k8s.api.admissionregistration.v1;

import java.lang.String;
import java.util.List;

/**
 * ValidatingAdmissionPolicyBindingSpec is the specification of the ValidatingAdmissionPolicyBinding.
 */
public class ValidatingAdmissionPolicyBindingSpec {
  public MatchResources matchResources;

  public ParamRef paramRef;

  public String policyName;

  public List<String> validationActions;

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

  /**
   * validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced. If a validation evaluates to false it is always enforced according to these actions.
   *
   * Failures defined by the ValidatingAdmissionPolicy&#39;s FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.
   *
   * validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.
   *
   * The supported actions values are:
   *
   * &#34;Deny&#34; specifies that a validation failure results in a denied request.
   *
   * &#34;Warn&#34; specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.
   *
   * &#34;Audit&#34; specifies that a validation failure is included in the published audit event for the request. The audit event will contain a `validation.policy.admission.k8s.io/validation_failure` audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: `&#34;validation.policy.admission.k8s.io/validation_failure&#34;: &#34;[{&#34;message&#34;: &#34;Invalid value&#34;, {&#34;policy&#34;: &#34;policy.example.com&#34;, {&#34;binding&#34;: &#34;policybinding.example.com&#34;, {&#34;expressionIndex&#34;: &#34;1&#34;, {&#34;validationActions&#34;: [&#34;Audit&#34;]}]&#34;`
   *
   * Clients should expect to handle additional values by ignoring any values not recognized.
   *
   * &#34;Deny&#34; and &#34;Warn&#34; may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.
   *
   * Required.
   */
  public ValidatingAdmissionPolicyBindingSpec validationActions(List<String> validationActions) {
    this.validationActions = validationActions;
    return this;
  }

  public static ValidatingAdmissionPolicyBindingSpec validatingAdmissionPolicyBindingSpec() {
    return new ValidatingAdmissionPolicyBindingSpec();
  }
}
