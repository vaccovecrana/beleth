package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * Selects a key from a ConfigMap.
 */
public class ConfigMapKeySelector {
  public String key;

  public String name;

  public Boolean optional;

  /**
   * The key to select.
   */
  public ConfigMapKeySelector key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public ConfigMapKeySelector name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specify whether the ConfigMap or its key must be defined
   */
  public ConfigMapKeySelector optional(Boolean optional) {
    this.optional = optional;
    return this;
  }
}
