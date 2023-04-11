package io.k8s.api.authorization.v1;

/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
public class SelfSubjectAccessReviewSpec {
  public NonResourceAttributes nonResourceAttributes;

  public ResourceAttributes resourceAttributes;

  public SelfSubjectAccessReviewSpec nonResourceAttributes(
      NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

  public SelfSubjectAccessReviewSpec resourceAttributes(ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }
}
