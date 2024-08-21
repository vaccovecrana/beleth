package io.k8s.api.admissionregistration.v1;

import java.lang.String;
import java.util.List;

/**
 * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
 */
public class RuleWithOperations {
  public List<String> apiGroups;

  public List<String> apiVersions;

  public List<String> operations;

  public List<String> resources;

  public String scope;

  /**
   * APIGroups is the API groups the resources belong to. &#39;<code>*</code>&#39; is all groups. If &#39;<code>*</code>&#39; is present, the length of the slice must be one. Required.
   */
  public RuleWithOperations apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  /**
   * APIVersions is the API versions the resources belong to. &#39;<code>*</code>&#39; is all versions. If &#39;<code>*</code>&#39; is present, the length of the slice must be one. Required.
   */
  public RuleWithOperations apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  /**
   * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or <code>*</code> for all of those operations and any future admission operations that are added. If &#39;<code>*</code>&#39; is present, the length of the slice must be one. Required.
   */
  public RuleWithOperations operations(List<String> operations) {
    this.operations = operations;
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
  public RuleWithOperations resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;<code>*</code>&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;<code>*</code>&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;<code>*</code>&#34;.
   */
  public RuleWithOperations scope(String scope) {
    this.scope = scope;
    return this;
  }

  public static RuleWithOperations ruleWithOperations() {
    return new RuleWithOperations();
  }
}
