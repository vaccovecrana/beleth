package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;

/**
 * EndpointPort is a tuple that describes a single port.
 */
public class EndpointPort {
  public String appProtocol;

  public String name;

  public Long port;

  public String protocol;

  /**
   * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
   */
  public EndpointPort appProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
    return this;
  }

  /**
   * The name of this port.  This must match the &#39;name&#39; field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
   */
  public EndpointPort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The port number of the endpoint.
   */
  public EndpointPort port(Long port) {
    this.port = port;
    return this;
  }

  /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
   *
   */
  public EndpointPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  public static EndpointPort endpointPort() {
    return new EndpointPort();
  }
}
