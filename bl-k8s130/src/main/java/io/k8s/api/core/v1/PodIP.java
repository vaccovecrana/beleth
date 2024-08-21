package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PodIP represents a single IP address allocated to the pod.
 */
public class PodIP {
  public String ip;

  /**
   * IP is the IP address assigned to the pod
   */
  public PodIP ip(String ip) {
    this.ip = ip;
    return this;
  }

  public static PodIP podIP() {
    return new PodIP();
  }
}
