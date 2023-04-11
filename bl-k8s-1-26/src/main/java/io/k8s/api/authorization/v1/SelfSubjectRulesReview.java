package io.k8s.api.authorization.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a namespace. The returned list of actions may be incomplete depending on the server&#39;s authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview should be used by UIs to show/hide actions, or to quickly let an end user reason about their permissions. It should NOT Be used by external systems to drive authorization decisions as this raises confused deputy, cache lifetime/revocation, and correctness concerns. SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization decisions to the API server.
 */
public class SelfSubjectRulesReview {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public SelfSubjectRulesReviewSpec spec;

  public SubjectRulesReviewStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public SelfSubjectRulesReview apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public SelfSubjectRulesReview kind(String kind) {
    this.kind = kind;
    return this;
  }

  public SelfSubjectRulesReview metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public SelfSubjectRulesReview spec(SelfSubjectRulesReviewSpec spec) {
    this.spec = spec;
    return this;
  }

  public SelfSubjectRulesReview status(SubjectRulesReviewStatus status) {
    this.status = status;
    return this;
  }
}
