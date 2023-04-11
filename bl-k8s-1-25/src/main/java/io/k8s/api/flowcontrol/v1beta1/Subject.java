package io.k8s.api.flowcontrol.v1beta1;

import java.lang.String;

/**
 * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
 */
public class Subject {
  public GroupSubject group;

  public String kind;

  public ServiceAccountSubject serviceAccount;

  public UserSubject user;

  public Subject group(GroupSubject group) {
    this.group = group;
    return this;
  }

  /**
   * `kind` indicates which one of the other fields is non-empty. Required
   */
  public Subject kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Subject serviceAccount(ServiceAccountSubject serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  public Subject user(UserSubject user) {
    this.user = user;
    return this;
  }
}
