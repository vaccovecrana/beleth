package io.k8s.api.core.v1.portstatus;

/**
 * Protocol is the protocol of the service port of which status is recorded here The supported values are: &#34;TCP&#34;, &#34;UDP&#34;, &#34;SCTP&#34;
 *
 * Possible enum values:
 *  - `&#34;SCTP&#34;` is the SCTP protocol.
 *  - `&#34;TCP&#34;` is the TCP protocol.
 *  - `&#34;UDP&#34;` is the UDP protocol.
 */
public enum Protocol {
  SCTP,

  TCP,

  UDP
}
