package io.k8s.api.authentication.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may be cached by the webhook token authenticator plugin in the kube-apiserver.
 */
public class TokenReview {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public TokenReviewSpec spec;

  public TokenReviewStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public TokenReview apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public TokenReview kind(String kind) {
    this.kind = kind;
    return this;
  }

  public TokenReview metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public TokenReview spec(TokenReviewSpec spec) {
    this.spec = spec;
    return this;
  }

  public TokenReview status(TokenReviewStatus status) {
    this.status = status;
    return this;
  }
}
