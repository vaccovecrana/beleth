
package io.k8s.api.core.v1;


public class TypedObjectReference {

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
    /**
     * Namespace is the namespace of resource being referenced Note that when a namespace is specified, a gateway.networking.k8s.io/ReferenceGrant object is required in the referent namespace to allow that namespace's owner to accept the reference. See the ReferenceGrant documentation for details. (Alpha) This field requires the CrossNamespaceVolumeDataSource feature gate to be enabled.
     * 
     */
    public String namespace;

    public TypedObjectReference withApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public TypedObjectReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public TypedObjectReference withName(String name) {
        this.name = name;
        return this;
    }

    public TypedObjectReference withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
