package io.k8s.api.authentication.v1;

import java.lang.String;
import java.util.List;

/**
 * TokenReviewSpec is a description of the token authentication request.
 */
public class TokenReviewSpec {
  public List<String> audiences;

  public String token;

  /**
   * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
   */
  public TokenReviewSpec audiences(List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  /**
   * Token is the opaque bearer token.
   */
  public TokenReviewSpec token(String token) {
    this.token = token;
    return this;
  }

  public static TokenReviewSpec tokenReviewSpec() {
    return new TokenReviewSpec();
  }
}
