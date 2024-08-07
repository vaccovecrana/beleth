package io.k8s.api.core.v1;

/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 */
public class Lifecycle {
  public LifecycleHandler postStart;

  public LifecycleHandler preStop;

  public Lifecycle postStart(LifecycleHandler postStart) {
    this.postStart = postStart;
    return this;
  }

  public Lifecycle preStop(LifecycleHandler preStop) {
    this.preStop = preStop;
    return this;
  }

  public static Lifecycle lifecycle() {
    return new Lifecycle();
  }
}
