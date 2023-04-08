
package io.k8s.api.rbac.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.
 * 
 */
public class RoleBinding {

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
     * RoleRef contains information that points to the role being used
     * (Required)
     * 
     */
    public RoleRef roleRef;
    /**
     * Subjects holds references to the objects the role applies to.
     * 
     */
    public List<Subject> subjects;

    public RoleBinding withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public RoleBinding withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public RoleBinding withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public RoleBinding withRoleRef(RoleRef roleRef) {
        this.roleRef = roleRef;
        return this;
    }

    public RoleBinding withSubjects(List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

}
