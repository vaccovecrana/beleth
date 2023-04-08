
package io.k8s.api.authorization.v1;

import java.util.List;


/**
 * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.
 * 
 */
public class SubjectRulesReviewStatus {

    /**
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
     * 
     */
    public String evaluationError;
    /**
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * (Required)
     * 
     */
    public Boolean incomplete;
    /**
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * (Required)
     * 
     */
    public List<NonResourceRule> nonResourceRules;
    /**
     * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * (Required)
     * 
     */
    public List<ResourceRule> resourceRules;

    public SubjectRulesReviewStatus withEvaluationError(String evaluationError) {
        this.evaluationError = evaluationError;
        return this;
    }

    public SubjectRulesReviewStatus withIncomplete(Boolean incomplete) {
        this.incomplete = incomplete;
        return this;
    }

    public SubjectRulesReviewStatus withNonResourceRules(List<NonResourceRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
        return this;
    }

    public SubjectRulesReviewStatus withResourceRules(List<ResourceRule> resourceRules) {
        this.resourceRules = resourceRules;
        return this;
    }

}
