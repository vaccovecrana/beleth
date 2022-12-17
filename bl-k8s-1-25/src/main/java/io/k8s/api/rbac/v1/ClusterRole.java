
package io.k8s.api.rbac.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 * 
 */
public class ClusterRole {

    /**
     * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
     * 
     */
    public AggregationRule aggregationRule;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    public List<PolicyRule> rules;

    public ClusterRole withAggregationRule(AggregationRule aggregationRule) {
        this.aggregationRule = aggregationRule;
        return this;
    }

    public ClusterRole withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ClusterRole withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ClusterRole withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ClusterRole withRules(List<PolicyRule> rules) {
        this.rules = rules;
        return this;
    }

}
