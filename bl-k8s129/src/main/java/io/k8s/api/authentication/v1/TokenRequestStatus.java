package io.k8s.api.authentication.v1;

import java.lang.String;

/**
 * TokenRequestStatus is the result of a token request.
 */
public class TokenRequestStatus {
  public String expirationTimestamp;

  public String token;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public TokenRequestStatus expirationTimestamp(String expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

  /**
   * Token is the opaque bearer token.
   */
  public TokenRequestStatus token(String token) {
    this.token = token;
    return this;
  }

  public static TokenRequestStatus tokenRequestStatus() {
    return new TokenRequestStatus();
  }
}
