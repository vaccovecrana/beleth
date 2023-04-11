package io.k8s.api.authentication.v1;

import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * TokenRequestSpec contains client provided parameters of a token request.
 */
public class TokenRequestSpec {
  public List<String> audiences;

  public BoundObjectReference boundObjectRef;

  public Long expirationSeconds;

  /**
   * Audiences are the intendend audiences of the token. A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
   */
  public TokenRequestSpec audiences(List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public TokenRequestSpec boundObjectRef(BoundObjectReference boundObjectRef) {
    this.boundObjectRef = boundObjectRef;
    return this;
  }

  /**
   * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the &#39;expiration&#39; field in a response.
   */
  public TokenRequestSpec expirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return this;
  }
}
