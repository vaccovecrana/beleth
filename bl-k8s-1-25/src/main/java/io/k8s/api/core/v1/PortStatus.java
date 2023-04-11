package io.k8s.api.core.v1;

import io.k8s.api.core.v1.portstatus.Protocol;
import java.lang.Long;
import java.lang.String;

public class PortStatus {
  public String error;

  public Long port;

  public Protocol protocol;

  /**
   * Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use
   *   CamelCase names
   * - cloud provider specific error values must have names that comply with the
   *   format foo.example.com/CamelCase.
   */
  public PortStatus error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Port is the port number of the service port of which status is recorded here
   */
  public PortStatus port(Long port) {
    this.port = port;
    return this;
  }

  /**
   * Protocol is the protocol of the service port of which status is recorded here The supported values are: &#34;TCP&#34;, &#34;UDP&#34;, &#34;SCTP&#34;
   *
   * Possible enum values:
   *  - `&#34;SCTP&#34;` is the SCTP protocol.
   *  - `&#34;TCP&#34;` is the TCP protocol.
   *  - `&#34;UDP&#34;` is the UDP protocol.
   */
  public PortStatus protocol(Protocol protocol) {
    this.protocol = protocol;
    return this;
  }
}
