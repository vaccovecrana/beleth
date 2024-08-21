package io.k8s.api.core.v1;

import java.lang.String;

/**
 * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
 */
public class NodeSystemInfo {
  public String architecture;

  public String bootID;

  public String containerRuntimeVersion;

  public String kernelVersion;

  public String kubeProxyVersion;

  public String kubeletVersion;

  public String machineID;

  public String operatingSystem;

  public String osImage;

  public String systemUUID;

  /**
   * The Architecture reported by the node
   */
  public NodeSystemInfo architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Boot ID reported by the node.
   */
  public NodeSystemInfo bootID(String bootID) {
    this.bootID = bootID;
    return this;
  }

  /**
   * ContainerRuntime Version reported by the node through runtime remote API (e.g. containerd://1.4.2).
   */
  public NodeSystemInfo containerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
    return this;
  }

  /**
   * Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
   */
  public NodeSystemInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * Deprecated: KubeProxy Version reported by the node.
   */
  public NodeSystemInfo kubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
    return this;
  }

  /**
   * Kubelet Version reported by the node.
   */
  public NodeSystemInfo kubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
    return this;
  }

  /**
   * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
   */
  public NodeSystemInfo machineID(String machineID) {
    this.machineID = machineID;
    return this;
  }

  /**
   * The Operating System reported by the node
   */
  public NodeSystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
   */
  public NodeSystemInfo osImage(String osImage) {
    this.osImage = osImage;
    return this;
  }

  /**
   * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
   */
  public NodeSystemInfo systemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
    return this;
  }

  public static NodeSystemInfo nodeSystemInfo() {
    return new NodeSystemInfo();
  }
}
