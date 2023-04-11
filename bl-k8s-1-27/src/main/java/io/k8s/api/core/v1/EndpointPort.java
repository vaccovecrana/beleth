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
   * The application protocol for this port. This is used as a hint for implementations to offer richer behavior for protocols that they understand. This field follows standard Kubernetes label syntax. Valid values are either:
   *
   * <code>*</code> Un-prefixed protocol names - reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names).
   *
   * <code>*</code> Kubernetes-defined prefixed names:
   *   <code>*</code> &#39;kubernetes.io/h2c&#39; - HTTP/2 over cleartext as described in https://www.rfc-editor.org/rfc/rfc7540
   *
   * <code>*</code> Other protocols should use implementation-defined prefixed names such as mycompany.com/my-custom-protocol.
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
   */
  public EndpointPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }
}
