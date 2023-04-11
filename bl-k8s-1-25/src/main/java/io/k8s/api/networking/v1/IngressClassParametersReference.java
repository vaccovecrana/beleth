package io.k8s.api.networking.v1;

import java.lang.String;

/**
 * IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.
 */
public class IngressClassParametersReference {
  public String apiGroup;

  public String kind;

  public String name;

  public String namespace;

  public String scope;

  /**
   * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
   */
  public IngressClassParametersReference apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * Kind is the type of resource being referenced.
   */
  public IngressClassParametersReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name is the name of resource being referenced.
   */
  public IngressClassParametersReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace is the namespace of the resource being referenced. This field is required when scope is set to &#34;Namespace&#34; and must be unset when scope is set to &#34;Cluster&#34;.
   */
  public IngressClassParametersReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Scope represents if this refers to a cluster or namespace scoped resource. This may be set to &#34;Cluster&#34; (default) or &#34;Namespace&#34;.
   */
  public IngressClassParametersReference scope(String scope) {
    this.scope = scope;
    return this;
  }
}
