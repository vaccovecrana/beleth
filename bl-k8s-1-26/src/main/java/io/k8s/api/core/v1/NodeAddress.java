package io.k8s.api.core.v1;

import java.lang.String;

/**
 * NodeAddress contains information for the node&#39;s address.
 */
public class NodeAddress {
  public String address;

  public String type;

  /**
   * The node address.
   */
  public NodeAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Node address type, one of Hostname, ExternalIP or InternalIP.
   */
  public NodeAddress type(String type) {
    this.type = type;
    return this;
  }
}
