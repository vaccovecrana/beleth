package io.k8s.api.core.v1;

import java.lang.String;

/**
 * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
 */
public class LocalObjectReference {
  public String name;

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public LocalObjectReference name(String name) {
    this.name = name;
    return this;
  }

  public static LocalObjectReference localObjectReference() {
    return new LocalObjectReference();
  }
}
