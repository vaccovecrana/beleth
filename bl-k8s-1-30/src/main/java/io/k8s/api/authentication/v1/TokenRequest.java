package io.k8s.api.authentication.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * TokenRequest requests a token for a given service account.
 */
public class TokenRequest {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public TokenRequestSpec spec;

  public TokenRequestStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public TokenRequest apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public TokenRequest kind(String kind) {
    this.kind = kind;
    return this;
  }

  public TokenRequest metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public TokenRequest spec(TokenRequestSpec spec) {
    this.spec = spec;
    return this;
  }

  public TokenRequest status(TokenRequestStatus status) {
    this.status = status;
    return this;
  }

  public static TokenRequest tokenRequest() {
    return new TokenRequest();
  }
}
