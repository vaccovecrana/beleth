package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ContainerStateWaiting is a waiting state of a container.
 */
public class ContainerStateWaiting {
  public String message;

  public String reason;

  /**
   * Message regarding why the container is not yet running.
   */
  public ContainerStateWaiting message(String message) {
    this.message = message;
    return this;
  }

  /**
   * (brief) reason the container is not yet running.
   */
  public ContainerStateWaiting reason(String reason) {
    this.reason = reason;
    return this;
  }

  public static ContainerStateWaiting containerStateWaiting() {
    return new ContainerStateWaiting();
  }
}
