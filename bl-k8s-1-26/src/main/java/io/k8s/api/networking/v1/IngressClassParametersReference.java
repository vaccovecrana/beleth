
package io.k8s.api.networking.v1;



/**
 * IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.
 * 
 */
public class IngressClassParametersReference {

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    public String apiGroup;
    /**
     * Kind is the type of resource being referenced.
     * (Required)
     * 
     */
    public String kind;
    /**
     * Name is the name of resource being referenced.
     * (Required)
     * 
     */
    public String name;
    /**
     * Namespace is the namespace of the resource being referenced. This field is required when scope is set to "Namespace" and must be unset when scope is set to "Cluster".
     * 
     */
    public String namespace;
    /**
     * Scope represents if this refers to a cluster or namespace scoped resource. This may be set to "Cluster" (default) or "Namespace".
     * 
     */
    public String scope;

    public IngressClassParametersReference withApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public IngressClassParametersReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public IngressClassParametersReference withName(String name) {
        this.name = name;
        return this;
    }

    public IngressClassParametersReference withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public IngressClassParametersReference withScope(String scope) {
        this.scope = scope;
        return this;
    }

}
