package io.k8s.api.core.v1;

/**
 * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
 */
public class ContainerState {
  public ContainerStateRunning running;

  public ContainerStateTerminated terminated;

  public ContainerStateWaiting waiting;

  public ContainerState running(ContainerStateRunning running) {
    this.running = running;
    return this;
  }

  public ContainerState terminated(ContainerStateTerminated terminated) {
    this.terminated = terminated;
    return this;
  }

  public ContainerState waiting(ContainerStateWaiting waiting) {
    this.waiting = waiting;
    return this;
  }
}
