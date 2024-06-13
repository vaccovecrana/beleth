package io.k8s.api.admissionregistration.v1;

import java.lang.String;
import java.util.List;

/**
 * NamedRuleWithOperations is a tuple of Operations and Resources with ResourceNames.
 */
public class NamedRuleWithOperations {
  public List<String> apiGroups;

  public List<String> apiVersions;

  public List<String> operations;

  public List<String> resourceNames;

  public List<String> resources;

  public String scope;

  /**
   * APIGroups is the API groups the resources belong to. &#39;<code>*</code>&#39; is all groups. If &#39;<code>*</code>&#39; is present, the length of the slice must be one. Required.
   */
  public NamedRuleWithOperations apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  /**
   * APIVersions is the API versions the resources belong to. &#39;<code>*</code>&#39; is all versions. If &#39;<code>*</code>&#39; is present, the length of the slice must be one. Required.
   */
  public NamedRuleWithOperations apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  /**
   * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or <code>*</code> for all of those operations and any future admission operations that are added. If &#39;<code>*</code>&#39; is present, the length of the slice must be one. Required.
   */
  public NamedRuleWithOperations operations(List<String> operations) {
    this.operations = operations;
    return this;
  }

  /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
   */
  public NamedRuleWithOperations resourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  /**
   * Resources is a list of resources this rule applies to.
   *
   * For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;<code>*</code>&#39; means all resources, but not subresources. &#39;pods/<code>*</code>&#39; means all subresources of pods. &#39;<code>*</code>/scale&#39; means all scale subresources. &#39;<code>*</code>/<code>*</code>&#39; means all resources and their subresources.
   *
   * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
   *
   * Depending on the enclosing object, subresources might not be allowed. Required.
   */
  public NamedRuleWithOperations resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;<code>*</code>&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;<code>*</code>&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;<code>*</code>&#34;.
   */
  public NamedRuleWithOperations scope(String scope) {
    this.scope = scope;
    return this;
  }
}
