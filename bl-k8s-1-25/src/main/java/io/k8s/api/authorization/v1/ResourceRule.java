
package io.k8s.api.authorization.v1;

import java.util.List;


/**
 * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
 * 
 */
public class ResourceRule {

    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  "*" means all.
     * 
     */
    public List<String> apiGroups;
    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * 
     */
    public List<String> resourceNames;
    /**
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*<!---->/foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * 
     */
    public List<String> resources;
    /**
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * (Required)
     * 
     */
    public List<String> verbs;

    public ResourceRule withApiGroups(List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public ResourceRule withResourceNames(List<String> resourceNames) {
        this.resourceNames = resourceNames;
        return this;
    }

    public ResourceRule withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    public ResourceRule withVerbs(List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

}
