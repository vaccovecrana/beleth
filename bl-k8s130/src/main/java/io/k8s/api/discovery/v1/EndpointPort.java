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
   * The application protocol for this port. This is used as a hint for implementations to offer richer behavior for protocols that they understand. This field follows standard Kubernetes label syntax. Valid values are either:
   *
   * <code>*</code> Un-prefixed protocol names - reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names).
   *
   * <code>*</code> Kubernetes-defined prefixed names:
   *   <code>*</code> &#39;kubernetes.io/h2c&#39; - HTTP/2 prior knowledge over cleartext as described in https://www.rfc-editor.org/rfc/rfc9113.html#name-starting-http-2-with-prior-
   *   <code>*</code> &#39;kubernetes.io/ws&#39;  - WebSocket over cleartext as described in https://www.rfc-editor.org/rfc/rfc6455
   *   <code>*</code> &#39;kubernetes.io/wss&#39; - WebSocket over TLS as described in https://www.rfc-editor.org/rfc/rfc6455
   *
   * <code>*</code> Other protocols should use implementation-defined prefixed names such as mycompany.com/my-custom-protocol.
   */
  public EndpointPort appProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
    return this;
  }

  /**
   * name represents the name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is derived from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: <code>*</code> must be no more than 63 characters long. <code>*</code> must consist of lower case alphanumeric characters or &#39;-&#39;. <code>*</code> must start and end with an alphanumeric character. Default is empty string.
   */
  public EndpointPort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * port represents the port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
   */
  public EndpointPort port(Long port) {
    this.port = port;
    return this;
  }

  /**
   * protocol represents the IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
   */
  public EndpointPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  public static EndpointPort endpointPort() {
    return new EndpointPort();
  }
}
