
package io.k8s.api.authorization.v1;



/**
 * SubjectAccessReviewStatus
 * 
 */
public class SubjectAccessReviewStatus {

    /**
     * Allowed is required. True if the action would be allowed, false otherwise.
     * (Required)
     * 
     */
    public Boolean allowed;
    /**
     * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
     * 
     */
    public Boolean denied;
    /**
     * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * 
     */
    public String evaluationError;
    /**
     * Reason is optional.  It indicates why a request was allowed or denied.
     * 
     */
    public String reason;

    public SubjectAccessReviewStatus withAllowed(Boolean allowed) {
        this.allowed = allowed;
        return this;
    }

    public SubjectAccessReviewStatus withDenied(Boolean denied) {
        this.denied = denied;
        return this;
    }

    public SubjectAccessReviewStatus withEvaluationError(String evaluationError) {
        this.evaluationError = evaluationError;
        return this;
    }

    public SubjectAccessReviewStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
