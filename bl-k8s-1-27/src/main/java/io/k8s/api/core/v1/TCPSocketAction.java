package io.k8s.api.core.v1;

import java.lang.String;

/**
 * TCPSocketAction describes an action based on opening a socket
 */
public class TCPSocketAction {
  public String host;

  public String port;

  /**
   * Optional: Host name to connect to, defaults to the pod IP.
   */
  public TCPSocketAction host(String host) {
    this.host = host;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   */
  public TCPSocketAction port(String port) {
    this.port = port;
    return this;
  }

  public static TCPSocketAction tCPSocketAction() {
    return new TCPSocketAction();
  }
}
