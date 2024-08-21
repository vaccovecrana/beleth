package io.k8s.api.authentication.v1;

import java.lang.String;

/**
 * BoundObjectReference is a reference to an object that a token is bound to.
 */
public class BoundObjectReference {
  public String apiVersion;

  public String kind;

  public String name;

  public String uid;

  /**
   * API version of the referent.
   */
  public BoundObjectReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind of the referent. Valid kinds are &#39;Pod&#39; and &#39;Secret&#39;.
   */
  public BoundObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the referent.
   */
  public BoundObjectReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UID of the referent.
   */
  public BoundObjectReference uid(String uid) {
    this.uid = uid;
    return this;
  }

  public static BoundObjectReference boundObjectReference() {
    return new BoundObjectReference();
  }
}
