package io.k8s.api.discovery.v1;

import java.lang.Long;
import java.lang.String;

/**
 * EndpointPort represents a Port used by an EndpointSlice
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
   * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: <code>*</code> must be no more than 63 characters long. <code>*</code> must consist of lower case alphanumeric characters or &#39;-&#39;. <code>*</code> must start and end with an alphanumeric character. Default is empty string.
   */
  public EndpointPort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
   */
  public EndpointPort port(Long port) {
    this.port = port;
    return this;
  }

  /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
   */
  public EndpointPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  public static EndpointPort endpointPort() {
    return new EndpointPort();
  }
}
