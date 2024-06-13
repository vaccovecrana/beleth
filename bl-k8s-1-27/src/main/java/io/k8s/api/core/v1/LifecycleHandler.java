package io.k8s.api.core.v1;

/**
 * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
 */
public class LifecycleHandler {
  public ExecAction exec;

  public HTTPGetAction httpGet;

  public TCPSocketAction tcpSocket;

  public LifecycleHandler exec(ExecAction exec) {
    this.exec = exec;
    return this;
  }

  public LifecycleHandler httpGet(HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

  public LifecycleHandler tcpSocket(TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

  public static LifecycleHandler lifecycleHandler() {
    return new LifecycleHandler();
  }
}
