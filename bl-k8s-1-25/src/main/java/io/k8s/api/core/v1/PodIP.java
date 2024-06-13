package io.k8s.api.core.v1;

import java.lang.String;

/**
 * IP address information for entries in the (plural) PodIPs field. Each entry includes:
 *
 * 	IP: An IP address allocated to the pod. Routable at least within the cluster.
 */
public class PodIP {
  public String ip;

  /**
   * ip is an IP address (IPv4 or IPv6) assigned to the pod
   */
  public PodIP ip(String ip) {
    this.ip = ip;
    return this;
  }

  public static PodIP podIP() {
    return new PodIP();
  }
}
