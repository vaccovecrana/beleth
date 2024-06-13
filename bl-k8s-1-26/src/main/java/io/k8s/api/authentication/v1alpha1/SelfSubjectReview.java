package io.k8s.api.authentication.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * SelfSubjectReview contains the user information that the kube-apiserver has about the user making this request. When using impersonation, users will receive the user info of the user being impersonated.
 */
public class SelfSubjectReview {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public SelfSubjectReviewStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public SelfSubjectReview apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public SelfSubjectReview kind(String kind) {
    this.kind = kind;
    return this;
  }

  public SelfSubjectReview metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public SelfSubjectReview status(SelfSubjectReviewStatus status) {
    this.status = status;
    return this;
  }

  public static SelfSubjectReview selfSubjectReview() {
    return new SelfSubjectReview();
  }
}
