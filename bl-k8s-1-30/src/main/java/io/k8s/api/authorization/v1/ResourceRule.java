package io.k8s.api.authorization.v1;

import java.lang.String;
import java.util.List;

/**
 * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
 */
public class ResourceRule {
  public List<String> apiGroups;

  public List<String> resourceNames;

  public List<String> resources;

  public List<String> verbs;

  /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  &#34;<code>*</code>&#34; means all.
   */
  public ResourceRule apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  &#34;<code>*</code>&#34; means all.
   */
  public ResourceRule resourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  /**
   * Resources is a list of resources this rule applies to.  &#34;<code>*</code>&#34; means all in the specified apiGroups.
   *  &#34;<code>*</code>/foo&#34; represents the subresource &#39;foo&#39; for all resources in the specified apiGroups.
   */
  public ResourceRule resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  &#34;<code>*</code>&#34; means all.
   */
  public ResourceRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }
}
