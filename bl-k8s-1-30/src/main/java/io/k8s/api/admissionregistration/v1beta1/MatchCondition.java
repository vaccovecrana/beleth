package io.k8s.api.admissionregistration.v1beta1;

import java.lang.String;

/**
 * MatchCondition represents a condition which must be fulfilled for a request to be sent to a webhook.
 */
public class MatchCondition {
  public String expression;

  public String name;

  /**
   * Expression represents the expression which will be evaluated by CEL. Must evaluate to bool. CEL expressions have access to the contents of the AdmissionRequest and Authorizer, organized into CEL variables:
   *
   * &#39;object&#39; - The object from the incoming request. The value is null for DELETE requests. &#39;oldObject&#39; - The existing object. The value is null for CREATE requests. &#39;request&#39; - Attributes of the admission request(/pkg/apis/admission/types.go#AdmissionRequest). &#39;authorizer&#39; - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.
   *   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz
   * &#39;authorizer.requestResource&#39; - A CEL ResourceCheck constructed from the &#39;authorizer&#39; and configured with the
   *   request resource.
   * Documentation on CEL: https://kubernetes.io/docs/reference/using-api/cel/
   *
   * Required.
   */
  public MatchCondition expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Name is an identifier for this match condition, used for strategic merging of MatchConditions, as well as providing an identifier for logging purposes. A good name should be descriptive of the associated expression. Name must be a qualified name consisting of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;, and must start and end with an alphanumeric character (e.g. &#39;MyName&#39;,  or &#39;my.name&#39;,  or &#39;123-abc&#39;, regex used for validation is &#39;([A-Za-z0-9][-A-Za-z0-9_.]<code>*</code>)?[A-Za-z0-9]&#39;) with an optional DNS subdomain prefix and &#39;/&#39; (e.g. &#39;example.com/MyName&#39;)
   *
   * Required.
   */
  public MatchCondition name(String name) {
    this.name = name;
    return this;
  }
}
