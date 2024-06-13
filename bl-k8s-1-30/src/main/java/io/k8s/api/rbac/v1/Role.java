package io.k8s.api.rbac.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;
import java.util.List;

/**
 * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
 */
public class Role {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public List<PolicyRule> rules;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Role apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Role kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Role metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Rules holds all the PolicyRules for this Role
   */
  public Role rules(List<PolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  public static Role role() {
    return new Role();
  }
}
