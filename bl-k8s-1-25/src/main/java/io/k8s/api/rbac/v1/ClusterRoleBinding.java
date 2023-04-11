package io.k8s.api.rbac.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;
import java.util.List;

/**
 * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject.
 */
public class ClusterRoleBinding {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public RoleRef roleRef;

  public List<Subject> subjects;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ClusterRoleBinding apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ClusterRoleBinding kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ClusterRoleBinding metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ClusterRoleBinding roleRef(RoleRef roleRef) {
    this.roleRef = roleRef;
    return this;
  }

  /**
   * Subjects holds references to the objects the role applies to.
   */
  public ClusterRoleBinding subjects(List<Subject> subjects) {
    this.subjects = subjects;
    return this;
  }
}
