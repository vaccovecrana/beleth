package io.k8s.api.rbac.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;
import java.util.List;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 */
public class ClusterRole {
  public AggregationRule aggregationRule;

  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public List<PolicyRule> rules;

  public ClusterRole aggregationRule(AggregationRule aggregationRule) {
    this.aggregationRule = aggregationRule;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ClusterRole apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ClusterRole kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ClusterRole metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Rules holds all the PolicyRules for this ClusterRole
   */
  public ClusterRole rules(List<PolicyRule> rules) {
    this.rules = rules;
    return this;
  }
}
