
package io.k8s.api.rbac.v1;



/**
 * RoleRef contains information that points to the role being used
 * 
 */
public class RoleRef {

    /**
     * APIGroup is the group for the resource being referenced
     * (Required)
     * 
     */
    public String apiGroup;
    /**
     * Kind is the type of resource being referenced
     * (Required)
     * 
     */
    public String kind;
    /**
     * Name is the name of resource being referenced
     * (Required)
     * 
     */
    public String name;

    public RoleRef withApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public RoleRef withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public RoleRef withName(String name) {
        this.name = name;
        return this;
    }

}
