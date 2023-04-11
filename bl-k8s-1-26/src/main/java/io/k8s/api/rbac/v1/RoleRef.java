package io.k8s.api.rbac.v1;

import java.lang.String;

/**
 * RoleRef contains information that points to the role being used
 */
public class RoleRef {
  public String apiGroup;

  public String kind;

  public String name;

  /**
   * APIGroup is the group for the resource being referenced
   */
  public RoleRef apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * Kind is the type of resource being referenced
   */
  public RoleRef kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name is the name of resource being referenced
   */
  public RoleRef name(String name) {
    this.name = name;
    return this;
  }
}
