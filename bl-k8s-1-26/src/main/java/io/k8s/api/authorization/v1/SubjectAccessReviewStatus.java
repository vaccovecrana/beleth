package io.k8s.api.authorization.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * SubjectAccessReviewStatus
 */
public class SubjectAccessReviewStatus {
  public Boolean allowed;

  public Boolean denied;

  public String evaluationError;

  public String reason;

  /**
   * Allowed is required. True if the action would be allowed, false otherwise.
   */
  public SubjectAccessReviewStatus allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

  /**
   * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
   */
  public SubjectAccessReviewStatus denied(Boolean denied) {
    this.denied = denied;
    return this;
  }

  /**
   * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
   */
  public SubjectAccessReviewStatus evaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
    return this;
  }

  /**
   * Reason is optional.  It indicates why a request was allowed or denied.
   */
  public SubjectAccessReviewStatus reason(String reason) {
    this.reason = reason;
    return this;
  }
}
