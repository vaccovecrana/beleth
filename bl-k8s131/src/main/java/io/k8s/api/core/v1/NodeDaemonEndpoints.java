package io.k8s.api.core.v1;

/**
 * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
 */
public class NodeDaemonEndpoints {
  public DaemonEndpoint kubeletEndpoint;

  public NodeDaemonEndpoints kubeletEndpoint(DaemonEndpoint kubeletEndpoint) {
    this.kubeletEndpoint = kubeletEndpoint;
    return this;
  }

  public static NodeDaemonEndpoints nodeDaemonEndpoints() {
    return new NodeDaemonEndpoints();
  }
}
