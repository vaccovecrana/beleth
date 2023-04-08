
package io.k8s.api.storage.v1;



/**
 * TokenRequest contains parameters of a service account token.
 * 
 */
public class TokenRequest {

    /**
     * Audience is the intended audience of the token in "TokenRequestSpec". It will default to the audiences of kube apiserver.
     * (Required)
     * 
     */
    public String audience;
    /**
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec". It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
     * 
     */
    public Integer expirationSeconds;

    public TokenRequest withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    public TokenRequest withExpirationSeconds(Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

}
