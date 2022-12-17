
package io.k8s.api.core.v1;



/**
 * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
 * 
 */
public class TypedLocalObjectReference {

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
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

    public TypedLocalObjectReference withApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public TypedLocalObjectReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public TypedLocalObjectReference withName(String name) {
        this.name = name;
        return this;
    }

}
