package io.k8s.api.core.v1.containerport;

/**
 * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to &#34;TCP&#34;.
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
