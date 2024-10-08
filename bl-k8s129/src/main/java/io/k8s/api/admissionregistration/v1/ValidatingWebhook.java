package io.k8s.api.admissionregistration.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
 */
public class ValidatingWebhook {
  public List<String> admissionReviewVersions;

  public WebhookClientConfig clientConfig;

  public String failurePolicy;

  public List<MatchCondition> matchConditions;

  public String matchPolicy;

  public String name;

  public LabelSelector namespaceSelector;

  public LabelSelector objectSelector;

  public List<RuleWithOperations> rules;

  public String sideEffects;

  public Long timeoutSeconds;

  /**
   * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
   */
  public ValidatingWebhook admissionReviewVersions(List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
    return this;
  }

  public ValidatingWebhook clientConfig(WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

  /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.
   */
  public ValidatingWebhook failurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

  /**
   * MatchConditions is a list of conditions that must be met for a request to be sent to this webhook. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.
   *
   * The exact matching logic is (in order):
   *   1. If ANY matchCondition evaluates to FALSE, the webhook is skipped.
   *   2. If ALL matchConditions evaluate to TRUE, the webhook is called.
   *   3. If any matchCondition evaluates to an error (but none are FALSE):
   *      - If failurePolicy=Fail, reject the request
   *      - If failurePolicy=Ignore, the error is ignored and the webhook is skipped
   *
   * This is a beta feature and managed by the AdmissionWebhookMatchConditions feature gate.
   */
  public ValidatingWebhook matchConditions(List<MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
    return this;
  }

  /**
   * matchPolicy defines how the &#34;rules&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
   *
   * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
   *
   * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
   *
   * Defaults to &#34;Equivalent&#34;
   */
  public ValidatingWebhook matchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return this;
  }

  /**
   * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where &#34;imagepolicy&#34; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
   */
  public ValidatingWebhook name(String name) {
    this.name = name;
    return this;
  }

  public ValidatingWebhook namespaceSelector(LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

  public ValidatingWebhook objectSelector(LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
    return this;
  }

  /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
   */
  public ValidatingWebhook rules(List<RuleWithOperations> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission chain and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
   */
  public ValidatingWebhook sideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
    return this;
  }

  /**
   * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
   */
  public ValidatingWebhook timeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public static ValidatingWebhook validatingWebhook() {
    return new ValidatingWebhook();
  }
}
