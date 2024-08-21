package io.k8s.api.discovery.v1;

import java.lang.String;

/**
 * ForZone provides information about which zones should consume this endpoint.
 */
public class ForZone {
  public String name;

  /**
   * name represents the name of the zone.
   */
  public ForZone name(String name) {
    this.name = name;
    return this;
  }

  public static ForZone forZone() {
    return new ForZone();
  }
}
