package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.String;

/**
 * ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.
 */
public class ServerAddressByClientCIDR {
  public String clientCIDR;

  public String serverAddress;

  /**
   * The CIDR with which clients can match their IP to figure out the server address that they should use.
   */
  public ServerAddressByClientCIDR clientCIDR(String clientCIDR) {
    this.clientCIDR = clientCIDR;
    return this;
  }

  /**
   * Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or IP:port.
   */
  public ServerAddressByClientCIDR serverAddress(String serverAddress) {
    this.serverAddress = serverAddress;
    return this;
  }
}
