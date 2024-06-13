package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * Adds and removes POSIX capabilities from running containers.
 */
public class Capabilities {
  public List<String> add;

  public List<String> drop;

  /**
   * Added capabilities
   */
  public Capabilities add(List<String> add) {
    this.add = add;
    return this;
  }

  /**
   * Removed capabilities
   */
  public Capabilities drop(List<String> drop) {
    this.drop = drop;
    return this;
  }

  public static Capabilities capabilities() {
    return new Capabilities();
  }
}
