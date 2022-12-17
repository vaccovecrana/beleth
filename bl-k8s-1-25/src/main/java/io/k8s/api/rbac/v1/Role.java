
package io.k8s.api.rbac.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
 * 
 */
public class Role {

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
     * Rules holds all the PolicyRules for this Role
     * 
     */
    public List<PolicyRule> rules;

    public Role withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Role withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Role withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Role withRules(List<PolicyRule> rules) {
        this.rules = rules;
        return this;
    }

}
