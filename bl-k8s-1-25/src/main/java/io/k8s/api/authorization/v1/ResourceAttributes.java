package io.k8s.api.authorization.v1;

import java.lang.String;

/**
 * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
 */
public class ResourceAttributes {
  public String group;

  public String name;

  public String namespace;

  public String resource;

  public String subresource;

  public String verb;

  public String version;

  /**
   * Group is the API Group of the Resource.  &#34;<code>*</code>&#34; means all.
   */
  public ResourceAttributes group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Name is the name of the resource being requested for a &#34;get&#34; or deleted for a &#34;delete&#34;. &#34;&#34; (empty) means all.
   */
  public ResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces &#34;&#34; (empty) is defaulted for LocalSubjectAccessReviews &#34;&#34; (empty) is empty for cluster-scoped resources &#34;&#34; (empty) means &#34;all&#34; for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
   */
  public ResourceAttributes namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Resource is one of the existing resource types.  &#34;<code>*</code>&#34; means all.
   */
  public ResourceAttributes resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Subresource is one of the existing resource types.  &#34;&#34; means none.
   */
  public ResourceAttributes subresource(String subresource) {
    this.subresource = subresource;
    return this;
  }

  /**
   * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  &#34;<code>*</code>&#34; means all.
   */
  public ResourceAttributes verb(String verb) {
    this.verb = verb;
    return this;
  }

  /**
   * Version is the API Version of the Resource.  &#34;<code>*</code>&#34; means all.
   */
  public ResourceAttributes version(String version) {
    this.version = version;
    return this;
  }
}
