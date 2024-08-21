package io.k8s.api.admissionregistration.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.String;
import java.util.List;

/**
 * MatchResources decides whether to run the admission control policy on an object based on whether it meets the match criteria. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
 */
public class MatchResources {
  public List<NamedRuleWithOperations> excludeResourceRules;

  public String matchPolicy;

  public LabelSelector namespaceSelector;

  public LabelSelector objectSelector;

  public List<NamedRuleWithOperations> resourceRules;

  /**
   * ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
   */
  public MatchResources excludeResourceRules(List<NamedRuleWithOperations> excludeResourceRules) {
    this.excludeResourceRules = excludeResourceRules;
    return this;
  }

  /**
   * matchPolicy defines how the &#34;MatchResources&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
   *
   * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.
   *
   * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.
   *
   * Defaults to &#34;Equivalent&#34;
   */
  public MatchResources matchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return this;
  }

  public MatchResources namespaceSelector(LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

  public MatchResources objectSelector(LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
    return this;
  }

  /**
   * ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
   */
  public MatchResources resourceRules(List<NamedRuleWithOperations> resourceRules) {
    this.resourceRules = resourceRules;
    return this;
  }

  public static MatchResources matchResources() {
    return new MatchResources();
  }
}
