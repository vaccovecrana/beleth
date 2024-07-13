package io.k8s.api.authentication.v1;

import io.k8s.api.authentication.v1.userinfo.Extra;
import java.lang.String;
import java.util.List;

/**
 * UserInfo holds the information about the user needed to implement the user.Info interface.
 */
public class UserInfo {
  public Extra extra;

  public List<String> groups;

  public String uid;

  public String username;

  /**
   * Any additional information provided by the authenticator.
   */
  public UserInfo extra(Extra extra) {
    this.extra = extra;
    return this;
  }

  /**
   * The names of groups this user is a part of.
   */
  public UserInfo groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  /**
   * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
   */
  public UserInfo uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * The name that uniquely identifies this user among all active users.
   */
  public UserInfo username(String username) {
    this.username = username;
    return this;
  }

  public static UserInfo userInfo() {
    return new UserInfo();
  }
}
