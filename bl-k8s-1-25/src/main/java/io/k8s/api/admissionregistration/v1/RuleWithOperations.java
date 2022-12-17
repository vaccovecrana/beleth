
package io.k8s.api.admissionregistration.v1;

import java.util.List;


/**
 * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
 * 
 */
public class RuleWithOperations {

    /**
     * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.
     * 
     */
    public List<String> apiGroups;
    /**
     * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.
     * 
     */
    public List<String> apiVersions;
    /**
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If '*' is present, the length of the slice must be one. Required.
     * 
     */
    public List<String> operations;
    /**
     * Resources is a list of resources this rule applies to.
     * 
     * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/*' means all subresources of pods. '*<!---->/scale' means all scale subresources. '*<!---->/*' means all resources and their subresources.
     * 
     * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
     * 
     * Depending on the enclosing object, subresources might not be allowed. Required.
     * 
     */
    public List<String> resources;
    /**
     * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*" "Cluster" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only namespaced resources will match this rule. "*" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is "*".
     * 
     */
    public String scope;

    public RuleWithOperations withApiGroups(List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public RuleWithOperations withApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    public RuleWithOperations withOperations(List<String> operations) {
        this.operations = operations;
        return this;
    }

    public RuleWithOperations withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    public RuleWithOperations withScope(String scope) {
        this.scope = scope;
        return this;
    }

}
