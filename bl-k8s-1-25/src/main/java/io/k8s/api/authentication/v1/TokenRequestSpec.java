
package io.k8s.api.authentication.v1;

import java.util.List;


/**
 * TokenRequestSpec contains client provided parameters of a token request.
 * 
 */
public class TokenRequestSpec {

    /**
     * Audiences are the intendend audiences of the token. A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
     * (Required)
     * 
     */
    public List<String> audiences;
    /**
     * BoundObjectReference is a reference to an object that a token is bound to.
     * 
     */
    public BoundObjectReference boundObjectRef;
    /**
     * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
     * 
     */
    public Integer expirationSeconds;

    public TokenRequestSpec withAudiences(List<String> audiences) {
        this.audiences = audiences;
        return this;
    }

    public TokenRequestSpec withBoundObjectRef(BoundObjectReference boundObjectRef) {
        this.boundObjectRef = boundObjectRef;
        return this;
    }

    public TokenRequestSpec withExpirationSeconds(Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

}
