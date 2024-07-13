package io.k8s.api.storage.v1;

import java.lang.Long;
import java.lang.String;

/**
 * TokenRequest contains parameters of a service account token.
 */
public class TokenRequest {
  public String audience;

  public Long expirationSeconds;

  /**
   * Audience is the intended audience of the token in &#34;TokenRequestSpec&#34;. It will default to the audiences of kube apiserver.
   */
  public TokenRequest audience(String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * ExpirationSeconds is the duration of validity of the token in &#34;TokenRequestSpec&#34;. It has the same default value of &#34;ExpirationSeconds&#34; in &#34;TokenRequestSpec&#34;.
   */
  public TokenRequest expirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return this;
  }

  public static TokenRequest tokenRequest() {
    return new TokenRequest();
  }
}
