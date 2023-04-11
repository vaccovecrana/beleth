package io.k8s.api.core.v1;

import java.lang.String;

/**
 * EndpointAddress is a tuple that describes single IP address.
 */
public class EndpointAddress {
  public String hostname;

  public String ip;

  public String nodeName;

  public ObjectReference targetRef;

  /**
   * The Hostname of this endpoint
   */
  public EndpointAddress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The IP of this endpoint. May not be loopback (127.0.0.0/8 or ::1), link-local (169.254.0.0/16 or fe80::/10), or link-local multicast (224.0.0.0/24 or ff02::/16).
   */
  public EndpointAddress ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
   */
  public EndpointAddress nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  public EndpointAddress targetRef(ObjectReference targetRef) {
    this.targetRef = targetRef;
    return this;
  }
}
