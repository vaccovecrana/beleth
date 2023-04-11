package io.k8s.api.flowcontrol.v1beta1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * ResourcePolicyRule is a predicate that matches some resource requests, testing the request&#39;s verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., `Namespace==&#34;&#34;`) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request&#39;s namespace.
 */
public class ResourcePolicyRule {
  public List<String> apiGroups;

  public Boolean clusterScope;

  public List<String> namespaces;

  public List<String> resources;

  public List<String> verbs;

  /**
   * `apiGroups` is a list of matching API groups and may not be empty. &#34;<code>*</code>&#34; matches all API groups and, if present, must be the only entry. Required.
   */
  public ResourcePolicyRule apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  /**
   * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
   */
  public ResourcePolicyRule clusterScope(Boolean clusterScope) {
    this.clusterScope = clusterScope;
    return this;
  }

  /**
   * `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;<code>*</code>&#34;.  Note that &#34;<code>*</code>&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
   */
  public ResourcePolicyRule namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  /**
   * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;<code>*</code>&#34; matches all resources and, if present, must be the only entry. Required.
   */
  public ResourcePolicyRule resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * `verbs` is a list of matching verbs and may not be empty. &#34;<code>*</code>&#34; matches all verbs and, if present, must be the only entry. Required.
   */
  public ResourcePolicyRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }
}
