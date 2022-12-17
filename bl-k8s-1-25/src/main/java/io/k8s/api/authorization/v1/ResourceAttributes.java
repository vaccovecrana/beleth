
package io.k8s.api.authorization.v1;



/**
 * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
 * 
 */
public class ResourceAttributes {

    /**
     * Group is the API Group of the Resource.  "*" means all.
     * 
     */
    public String group;
    /**
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * 
     */
    public String name;
    /**
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * 
     */
    public String namespace;
    /**
     * Resource is one of the existing resource types.  "*" means all.
     * 
     */
    public String resource;
    /**
     * Subresource is one of the existing resource types.  "" means none.
     * 
     */
    public String subresource;
    /**
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * 
     */
    public String verb;
    /**
     * Version is the API Version of the Resource.  "*" means all.
     * 
     */
    public String version;

    public ResourceAttributes withGroup(String group) {
        this.group = group;
        return this;
    }

    public ResourceAttributes withName(String name) {
        this.name = name;
        return this;
    }

    public ResourceAttributes withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ResourceAttributes withResource(String resource) {
        this.resource = resource;
        return this;
    }

    public ResourceAttributes withSubresource(String subresource) {
        this.subresource = subresource;
        return this;
    }

    public ResourceAttributes withVerb(String verb) {
        this.verb = verb;
        return this;
    }

    public ResourceAttributes withVersion(String version) {
        this.version = version;
        return this;
    }

}
