package io.k8s.api.authorization.v1;

import io.k8s.api.authorization.v1.subjectaccessreviewspec.Extra;
import java.lang.String;
import java.util.List;

/**
 * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
public class SubjectAccessReviewSpec {
  public Extra extra;

  public List<String> groups;

  public NonResourceAttributes nonResourceAttributes;

  public ResourceAttributes resourceAttributes;

  public String uid;

  public String user;

  /**
   * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
   */
  public SubjectAccessReviewSpec extra(Extra extra) {
    this.extra = extra;
    return this;
  }

  /**
   * Groups is the groups you&#39;re testing for.
   */
  public SubjectAccessReviewSpec groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public SubjectAccessReviewSpec nonResourceAttributes(
      NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

  public SubjectAccessReviewSpec resourceAttributes(ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

  /**
   * UID information about the requesting user.
   */
  public SubjectAccessReviewSpec uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * User is the user you&#39;re testing for. If you specify &#34;User&#34; but not &#34;Groups&#34;, then is it interpreted as &#34;What if User were not a member of any groups
   */
  public SubjectAccessReviewSpec user(String user) {
    this.user = user;
    return this;
  }

  public static SubjectAccessReviewSpec subjectAccessReviewSpec() {
    return new SubjectAccessReviewSpec();
  }
}
