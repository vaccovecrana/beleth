package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PodDNSConfigOption defines DNS resolver options of a pod.
 */
public class PodDNSConfigOption {
  public String name;

  public String value;

  /**
   * Required.
   */
  public PodDNSConfigOption name(String name) {
    this.name = name;
    return this;
  }

  public PodDNSConfigOption value(String value) {
    this.value = value;
    return this;
  }

  public static PodDNSConfigOption podDNSConfigOption() {
    return new PodDNSConfigOption();
  }
}
