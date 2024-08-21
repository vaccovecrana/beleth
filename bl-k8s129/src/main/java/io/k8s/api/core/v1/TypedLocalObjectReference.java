package io.k8s.api.core.v1;

import java.lang.String;

/**
 * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
 */
public class TypedLocalObjectReference {
  public String apiGroup;

  public String kind;

  public String name;

  /**
   * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
   */
  public TypedLocalObjectReference apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * Kind is the type of resource being referenced
   */
  public TypedLocalObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name is the name of resource being referenced
   */
  public TypedLocalObjectReference name(String name) {
    this.name = name;
    return this;
  }

  public static TypedLocalObjectReference typedLocalObjectReference() {
    return new TypedLocalObjectReference();
  }
}
