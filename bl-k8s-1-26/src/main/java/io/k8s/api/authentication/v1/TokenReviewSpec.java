
package io.k8s.api.authentication.v1;

import java.util.List;


/**
 * TokenReviewSpec is a description of the token authentication request.
 * 
 */
public class TokenReviewSpec {

    /**
     * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
     * 
     */
    public List<String> audiences;
    /**
     * Token is the opaque bearer token.
     * 
     */
    public String token;

    public TokenReviewSpec withAudiences(List<String> audiences) {
        this.audiences = audiences;
        return this;
    }

    public TokenReviewSpec withToken(String token) {
        this.token = token;
        return this;
    }

}
