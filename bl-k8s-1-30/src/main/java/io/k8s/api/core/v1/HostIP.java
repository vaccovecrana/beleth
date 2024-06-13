package io.k8s.api.core.v1;

import java.lang.String;

/**
 * HostIP represents a single IP address allocated to the host.
 */
public class HostIP {
  public String ip;

  /**
   * IP is the IP address assigned to the host
   */
  public HostIP ip(String ip) {
    this.ip = ip;
    return this;
  }
}
