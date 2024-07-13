package io.k8s.api.authentication.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * TokenReviewStatus is the result of the token authentication request.
 */
public class TokenReviewStatus {
  public List<String> audiences;

  public Boolean authenticated;

  public String error;

  public UserInfo user;

  /**
   * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token&#39;s audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is &#34;true&#34;, the token is valid against the audience of the Kubernetes API server.
   */
  public TokenReviewStatus audiences(List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  /**
   * Authenticated indicates that the token was associated with a known user.
   */
  public TokenReviewStatus authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

  /**
   * Error indicates that the token couldn&#39;t be checked
   */
  public TokenReviewStatus error(String error) {
    this.error = error;
    return this;
  }

  public TokenReviewStatus user(UserInfo user) {
    this.user = user;
    return this;
  }

  public static TokenReviewStatus tokenReviewStatus() {
    return new TokenReviewStatus();
  }
}
