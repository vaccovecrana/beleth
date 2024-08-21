package io.k8s.api.core.v1;

/**
 * ContainerUser represents user identity information
 */
public class ContainerUser {
  public LinuxContainerUser linux;

  public ContainerUser linux(LinuxContainerUser linux) {
    this.linux = linux;
    return this;
  }

  public static ContainerUser containerUser() {
    return new ContainerUser();
  }
}
