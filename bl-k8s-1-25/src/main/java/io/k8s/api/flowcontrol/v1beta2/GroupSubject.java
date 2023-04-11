package io.k8s.api.flowcontrol.v1beta2;

import java.lang.String;

/**
 * GroupSubject holds detailed information for group-kind subject.
 */
public class GroupSubject {
  public String name;

  /**
   * name is the user group that matches, or &#34;<code>*</code>&#34; to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
   */
  public GroupSubject name(String name) {
    this.name = name;
    return this;
  }
}
