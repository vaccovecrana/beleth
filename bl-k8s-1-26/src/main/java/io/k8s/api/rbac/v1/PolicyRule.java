
package io.k8s.api.rbac.v1;

import java.util.List;


/**
 * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
 * 
 */
public class PolicyRule {

    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed. "" represents the core API group and "*" represents all API groups.
     * 
     */
    public List<String> apiGroups;
    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * 
     */
    public List<String> nonResourceURLs;
    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    public List<String> resourceNames;
    /**
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * 
     */
    public List<String> resources;
    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * (Required)
     * 
     */
    public List<String> verbs;

    public PolicyRule withApiGroups(List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public PolicyRule withNonResourceURLs(List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
        return this;
    }

    public PolicyRule withResourceNames(List<String> resourceNames) {
        this.resourceNames = resourceNames;
        return this;
    }

    public PolicyRule withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    public PolicyRule withVerbs(List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

}
