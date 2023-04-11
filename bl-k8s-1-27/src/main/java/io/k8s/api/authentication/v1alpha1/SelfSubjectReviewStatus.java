package io.k8s.api.authentication.v1alpha1;

import io.k8s.api.authentication.v1.UserInfo;

/**
 * SelfSubjectReviewStatus is filled by the kube-apiserver and sent back to a user.
 */
public class SelfSubjectReviewStatus {
  public UserInfo userInfo;

  public SelfSubjectReviewStatus userInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
    return this;
  }
}
