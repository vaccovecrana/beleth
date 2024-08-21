package io.k8s.api.authorization.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a given namespace. Having a namespace scoped resource makes it much easier to grant namespace scoped policy that includes permissions checking.
 */
public class LocalSubjectAccessReview {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public SubjectAccessReviewSpec spec;

  public SubjectAccessReviewStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public LocalSubjectAccessReview apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public LocalSubjectAccessReview kind(String kind) {
    this.kind = kind;
    return this;
  }

  public LocalSubjectAccessReview metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public LocalSubjectAccessReview spec(SubjectAccessReviewSpec spec) {
    this.spec = spec;
    return this;
  }

  public LocalSubjectAccessReview status(SubjectAccessReviewStatus status) {
    this.status = status;
    return this;
  }

  public static LocalSubjectAccessReview localSubjectAccessReview() {
    return new LocalSubjectAccessReview();
  }
}
