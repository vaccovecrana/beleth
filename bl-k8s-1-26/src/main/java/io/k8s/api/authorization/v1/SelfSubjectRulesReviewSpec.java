
package io.k8s.api.authorization.v1;



/**
 * SelfSubjectRulesReviewSpec defines the specification for SelfSubjectRulesReview.
 * 
 */
public class SelfSubjectRulesReviewSpec {

    /**
     * Namespace to evaluate rules for. Required.
     * 
     */
    public String namespace;

    public SelfSubjectRulesReviewSpec withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
