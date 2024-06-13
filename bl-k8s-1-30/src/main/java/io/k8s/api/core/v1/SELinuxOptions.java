package io.k8s.api.core.v1;

import java.lang.String;

/**
 * SELinuxOptions are the labels to be applied to the container
 */
public class SELinuxOptions {
  public String level;

  public String role;

  public String type;

  public String user;

  /**
   * Level is SELinux level label that applies to the container.
   */
  public SELinuxOptions level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Role is a SELinux role label that applies to the container.
   */
  public SELinuxOptions role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Type is a SELinux type label that applies to the container.
   */
  public SELinuxOptions type(String type) {
    this.type = type;
    return this;
  }

  /**
   * User is a SELinux user label that applies to the container.
   */
  public SELinuxOptions user(String user) {
    this.user = user;
    return this;
  }
}
