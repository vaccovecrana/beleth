package io.k8s.api.resource.v1alpha2;

import java.lang.String;

/**
 * ResourceClassParametersReference contains enough information to let you locate the parameters for a ResourceClass.
 */
public class ResourceClassParametersReference {
  public String apiGroup;

  public String kind;

  public String name;

  public String namespace;

  /**
   * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
   */
  public ResourceClassParametersReference apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata.
   */
  public ResourceClassParametersReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name is the name of resource being referenced.
   */
  public ResourceClassParametersReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.
   */
  public ResourceClassParametersReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
}
