package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * SecretEnvSource selects a Secret to populate the environment variables with.
 *
 * The contents of the target Secret&#39;s Data field will represent the key-value pairs as environment variables.
 */
public class SecretEnvSource {
  public String name;

  public Boolean optional;

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public SecretEnvSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specify whether the Secret must be defined
   */
  public SecretEnvSource optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  public static SecretEnvSource secretEnvSource() {
    return new SecretEnvSource();
  }
}
