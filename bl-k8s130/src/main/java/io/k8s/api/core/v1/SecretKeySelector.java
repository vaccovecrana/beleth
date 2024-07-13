package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * SecretKeySelector selects a key of a Secret.
 */
public class SecretKeySelector {
  public String key;

  public String name;

  public Boolean optional;

  /**
   * The key of the secret to select from.  Must be a valid secret key.
   */
  public SecretKeySelector key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public SecretKeySelector name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specify whether the Secret or its key must be defined
   */
  public SecretKeySelector optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  public static SecretKeySelector secretKeySelector() {
    return new SecretKeySelector();
  }
}
