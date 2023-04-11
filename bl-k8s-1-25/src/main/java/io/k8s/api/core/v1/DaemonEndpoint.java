package io.k8s.api.core.v1;

import java.lang.Long;

/**
 * DaemonEndpoint contains information about a single Daemon endpoint.
 */
public class DaemonEndpoint {
  public Long Port;

  /**
   * Port number of the given endpoint.
   */
  public DaemonEndpoint Port(Long Port) {
    this.Port = Port;
    return this;
  }
}
