package io.k8s.api.admissionregistration.v1alpha1;

import java.lang.String;

/**
 * Validation specifies the CEL expression which is used to apply the validation.
 */
public class Validation {
  public String expression;

  public String message;

  public String reason;

  /**
   * Expression represents the expression which will be evaluated by CEL. ref: https://github.com/google/cel-spec CEL expressions have access to the contents of the Admission request/response, organized into CEL variables as well as some other useful variables:
   *
   * &#39;object&#39; - The object from the incoming request. The value is null for DELETE requests. &#39;oldObject&#39; - The existing object. The value is null for CREATE requests. &#39;request&#39; - Attributes of the admission request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). &#39;params&#39; - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind.
   *
   * The `apiVersion`, `kind`, `metadata.name` and `metadata.generateName` are always accessible from the root of the object. No other metadata properties are accessible.
   *
   * Only property names of the form `[a-zA-Z_.-/][a-zA-Z0-9_.-/]<code>*</code>` are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - &#39;__&#39; escapes to &#39;__underscores__&#39; - &#39;.&#39; escapes to &#39;__dot__&#39; - &#39;-&#39; escapes to &#39;__dash__&#39; - &#39;/&#39; escapes to &#39;__slash__&#39; - Property names that exactly match a CEL RESERVED keyword escape to &#39;__{keyword}__&#39;. The keywords are:
   * 	  &#34;true&#34;, &#34;false&#34;, &#34;null&#34;, &#34;in&#34;, &#34;as&#34;, &#34;break&#34;, &#34;const&#34;, &#34;continue&#34;, &#34;else&#34;, &#34;for&#34;, &#34;function&#34;, &#34;if&#34;,
   * 	  &#34;import&#34;, &#34;let&#34;, &#34;loop&#34;, &#34;package&#34;, &#34;namespace&#34;, &#34;return&#34;.
   * Examples:
   *   - Expression accessing a property named &#34;namespace&#34;: {&#34;Expression&#34;: &#34;object.__namespace__ &#62; 0&#34;}
   *   - Expression accessing a property named &#34;x-prop&#34;: {&#34;Expression&#34;: &#34;object.x__dash__prop &#62; 0&#34;}
   *   - Expression accessing a property named &#34;redact__d&#34;: {&#34;Expression&#34;: &#34;object.redact__underscores__d &#62; 0&#34;}
   *
   * Equality on arrays with list type of &#39;set&#39; or &#39;map&#39; ignores element order, i.e. [1, 2] == [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:
   *   - &#39;set&#39;: `X + Y` performs a union where the array positions of all elements in `X` are preserved and
   *     non-intersecting elements in `Y` are appended, retaining their partial order.
   *   - &#39;map&#39;: `X + Y` performs a merge where the array positions of all keys in `X` are preserved but the values
   *     are overwritten by values in `Y` when the key sets of `X` and `Y` intersect. Elements in `Y` with
   *     non-intersecting keys are appended, retaining their partial order.
   * Required.
   */
  public Validation expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Message represents the message displayed when validation fails. The message is required if the Expression contains line breaks. The message must not contain line breaks. If unset, the message is &#34;failed rule: {Rule}&#34;. e.g. &#34;must be a URL with the host matching spec.host&#34; If the Expression contains line breaks. Message is required. The message must not contain line breaks. If unset, the message is &#34;failed Expression: {Expression}&#34;.
   */
  public Validation message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Reason represents a machine-readable description of why this validation failed. If this is the first validation in the list to fail, this reason, as well as the corresponding HTTP response code, are used in the HTTP response to the client. The currently supported reasons are: &#34;Unauthorized&#34;, &#34;Forbidden&#34;, &#34;Invalid&#34;, &#34;RequestEntityTooLarge&#34;. If not set, StatusReasonInvalid is used in the response to the client.
   */
  public Validation reason(String reason) {
    this.reason = reason;
    return this;
  }
}
