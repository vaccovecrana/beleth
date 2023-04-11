package io.k8s.api.admissionregistration.v1alpha1;

import java.lang.String;

/**
 * ParamRef references a parameter resource
 */
public class ParamRef {
  public String name;

  public String namespace;

  /**
   * Name of the resource being referenced.
   */
  public ParamRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace of the referenced resource. Should be empty for the cluster-scoped resources
   */
  public ParamRef namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
}
