
package io.k8s.api.rbac.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject.
 * 
 */
public class ClusterRoleBinding {

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

    public ClusterRoleBinding withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ClusterRoleBinding withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ClusterRoleBinding withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ClusterRoleBinding withRoleRef(RoleRef roleRef) {
        this.roleRef = roleRef;
        return this;
    }

    public ClusterRoleBinding withSubjects(List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

}
