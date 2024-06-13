package io.k8s.api.authorization.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a spec.namespace means &#34;in all namespaces&#34;.  Self is a special case, because users should always be able to check whether they can perform an action
 */
public class SelfSubjectAccessReview {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public SelfSubjectAccessReviewSpec spec;

  public SubjectAccessReviewStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public SelfSubjectAccessReview apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public SelfSubjectAccessReview kind(String kind) {
    this.kind = kind;
    return this;
  }

  public SelfSubjectAccessReview metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public SelfSubjectAccessReview spec(SelfSubjectAccessReviewSpec spec) {
    this.spec = spec;
    return this;
  }

  public SelfSubjectAccessReview status(SubjectAccessReviewStatus status) {
    this.status = status;
    return this;
  }
}
