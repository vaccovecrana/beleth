package io.k8s.api.apps.v1;

import java.lang.String;

/**
 * Spec to control the desired behavior of rolling update.
 */
public class RollingUpdateDeployment {
  public String maxSurge;

  public String maxUnavailable;

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   */
  public RollingUpdateDeployment maxSurge(String maxSurge) {
    this.maxSurge = maxSurge;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   */
  public RollingUpdateDeployment maxUnavailable(String maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

  public static RollingUpdateDeployment rollingUpdateDeployment() {
    return new RollingUpdateDeployment();
  }
}
