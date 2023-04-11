package io.k8s.api.core.v1.serviceport;

/**
 * The IP protocol for this port. Supports &#34;TCP&#34;, &#34;UDP&#34;, and &#34;SCTP&#34;. Default is TCP.
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
