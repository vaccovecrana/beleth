package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Sysctl defines a kernel parameter to be set
 */
public class Sysctl {
  public String name;

  public String value;

  /**
   * Name of a property to set
   */
  public Sysctl name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Value of a property to set
   */
  public Sysctl value(String value) {
    this.value = value;
    return this;
  }
}
