package io.k8s.api.core.v1;

import io.k8s.api.core.v1.containerport.Protocol;
import java.lang.Long;
import java.lang.String;

/**
 * ContainerPort represents a network port in a single container.
 */
public class ContainerPort {
  public Long containerPort;

  public String hostIP;

  public Long hostPort;

  public String name;

  public Protocol protocol;

  /**
   * Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &#60; x &#60; 65536.
   */
  public ContainerPort containerPort(Long containerPort) {
    this.containerPort = containerPort;
    return this;
  }

  /**
   * What host IP to bind the external port to.
   */
  public ContainerPort hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

  /**
   * Number of port to expose on the host. If specified, this must be a valid port number, 0 &#60; x &#60; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
   */
  public ContainerPort hostPort(Long hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
   */
  public ContainerPort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to &#34;TCP&#34;.
   *
   * Possible enum values:
   *  - `&#34;SCTP&#34;` is the SCTP protocol.
   *  - `&#34;TCP&#34;` is the TCP protocol.
   *  - `&#34;UDP&#34;` is the UDP protocol.
   */
  public ContainerPort protocol(Protocol protocol) {
    this.protocol = protocol;
    return this;
  }
}
