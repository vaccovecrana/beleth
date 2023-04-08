
package io.k8s.api.authorization.v1;

import java.util.List;


/**
 * NonResourceRule holds information that describes a rule for the non-resource
 * 
 */
public class NonResourceRule {

    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  "*" means all.
     * 
     */
    public List<String> nonResourceURLs;
    /**
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * (Required)
     * 
     */
    public List<String> verbs;

    public NonResourceRule withNonResourceURLs(List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
        return this;
    }

    public NonResourceRule withVerbs(List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

}
