package io.k8s.api.flowcontrol.v1;

import java.lang.String;

/**
 * UserSubject holds detailed information for user-kind subject.
 */
public class UserSubject {
  public String name;

  /**
   * `name` is the username that matches, or &#34;<code>*</code>&#34; to match all usernames. Required.
   */
  public UserSubject name(String name) {
    this.name = name;
    return this;
  }

  public static UserSubject userSubject() {
    return new UserSubject();
  }
}
