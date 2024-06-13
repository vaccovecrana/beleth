package io.k8s.api.authentication.v1;

/**
 * SelfSubjectReviewStatus is filled by the kube-apiserver and sent back to a user.
 */
public class SelfSubjectReviewStatus {
  public UserInfo userInfo;

  public SelfSubjectReviewStatus userInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
    return this;
  }

  public static SelfSubjectReviewStatus selfSubjectReviewStatus() {
    return new SelfSubjectReviewStatus();
  }
}
