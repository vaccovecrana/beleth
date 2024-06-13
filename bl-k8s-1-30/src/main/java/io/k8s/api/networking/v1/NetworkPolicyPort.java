package io.k8s.api.networking.v1;

import java.lang.Long;
import java.lang.String;

/**
 * NetworkPolicyPort describes a port to allow traffic on
 */
public class NetworkPolicyPort {
  public Long endPort;

  public String port;

  public String protocol;

  /**
   * endPort indicates that the range of ports from port to endPort if set, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
   */
  public NetworkPolicyPort endPort(Long endPort) {
    this.endPort = endPort;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   */
  public NetworkPolicyPort port(String port) {
    this.port = port;
    return this;
  }

  /**
   * protocol represents the protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
   */
  public NetworkPolicyPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }
}
