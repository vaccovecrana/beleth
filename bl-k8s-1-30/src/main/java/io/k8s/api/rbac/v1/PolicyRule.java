package io.k8s.api.rbac.v1;

import java.lang.String;
import java.util.List;

/**
 * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
 */
public class PolicyRule {
  public List<String> apiGroups;

  public List<String> nonResourceURLs;

  public List<String> resourceNames;

  public List<String> resources;

  public List<String> verbs;

  /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed. &#34;&#34; represents the core API group and &#34;<code>*</code>&#34; represents all API groups.
   */
  public PolicyRule apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  <code>*</code>s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as &#34;pods&#34; or &#34;secrets&#34;) or non-resource URL paths (such as &#34;/api&#34;),  but not both.
   */
  public PolicyRule nonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
   */
  public PolicyRule resourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  /**
   * Resources is a list of resources this rule applies to. &#39;<code>*</code>&#39; represents all resources.
   */
  public PolicyRule resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. &#39;<code>*</code>&#39; represents all verbs.
   */
  public PolicyRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public static PolicyRule policyRule() {
    return new PolicyRule();
  }
}
