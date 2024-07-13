package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;

/**
 * ServicePort contains information on service&#39;s port.
 */
public class ServicePort {
  public String appProtocol;

  public String name;

  public Long nodePort;

  public Long port;

  public String protocol;

  public String targetPort;

  /**
   * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
   */
  public ServicePort appProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
    return this;
  }

  /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the &#39;name&#39; field in the EndpointPort. Optional if only one ServicePort is defined on this service.
   */
  public ServicePort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
   */
  public ServicePort nodePort(Long nodePort) {
    this.nodePort = nodePort;
    return this;
  }

  /**
   * The port that will be exposed by this service.
   */
  public ServicePort port(Long port) {
    this.port = port;
    return this;
  }

  /**
   * The IP protocol for this port. Supports &#34;TCP&#34;, &#34;UDP&#34;, and &#34;SCTP&#34;. Default is TCP.
   */
  public ServicePort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   */
  public ServicePort targetPort(String targetPort) {
    this.targetPort = targetPort;
    return this;
  }

  public static ServicePort servicePort() {
    return new ServicePort();
  }
}
