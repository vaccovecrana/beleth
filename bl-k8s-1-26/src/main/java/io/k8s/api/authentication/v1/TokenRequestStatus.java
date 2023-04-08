
package io.k8s.api.authentication.v1;



/**
 * TokenRequestStatus is the result of a token request.
 * 
 */
public class TokenRequestStatus {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * (Required)
     * 
     */
    public String expirationTimestamp;
    /**
     * Token is the opaque bearer token.
     * (Required)
     * 
     */
    public String token;

    public TokenRequestStatus withExpirationTimestamp(String expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
        return this;
    }

    public TokenRequestStatus withToken(String token) {
        this.token = token;
        return this;
    }

}
