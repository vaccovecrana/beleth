
package io.k8s.api.authentication.v1;

import java.util.List;


/**
 * TokenReviewStatus is the result of the token authentication request.
 * 
 */
public class TokenReviewStatus {

    /**
     * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is "true", the token is valid against the audience of the Kubernetes API server.
     * 
     */
    public List<String> audiences;
    /**
     * Authenticated indicates that the token was associated with a known user.
     * 
     */
    public Boolean authenticated;
    /**
     * Error indicates that the token couldn't be checked
     * 
     */
    public String error;
    /**
     * UserInfo holds the information about the user needed to implement the user.Info interface.
     * 
     */
    public UserInfo user;

    public TokenReviewStatus withAudiences(List<String> audiences) {
        this.audiences = audiences;
        return this;
    }

    public TokenReviewStatus withAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
        return this;
    }

    public TokenReviewStatus withError(String error) {
        this.error = error;
        return this;
    }

    public TokenReviewStatus withUser(UserInfo user) {
        this.user = user;
        return this;
    }

}
