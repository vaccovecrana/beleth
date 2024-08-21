package io.k8s.api.authorization.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * SubjectAccessReview checks whether or not a user or group can perform an action.
 */
public class SubjectAccessReview {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public SubjectAccessReviewSpec spec;

  public SubjectAccessReviewStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public SubjectAccessReview apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public SubjectAccessReview kind(String kind) {
    this.kind = kind;
    return this;
  }

  public SubjectAccessReview metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public SubjectAccessReview spec(SubjectAccessReviewSpec spec) {
    this.spec = spec;
    return this;
  }

  public SubjectAccessReview status(SubjectAccessReviewStatus status) {
    this.status = status;
    return this;
  }

  public static SubjectAccessReview subjectAccessReview() {
    return new SubjectAccessReview();
  }
}
