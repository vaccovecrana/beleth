
package io.k8s.api.rbac.v1;



/**
 * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
 * 
 */
public class Subject {

    /**
     * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * 
     */
    public String apiGroup;
    /**
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * (Required)
     * 
     */
    public String kind;
    /**
     * Name of the object being referenced.
     * (Required)
     * 
     */
    public String name;
    /**
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
     * 
     */
    public String namespace;

    public Subject withApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public Subject withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Subject withName(String name) {
        this.name = name;
        return this;
    }

    public Subject withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
