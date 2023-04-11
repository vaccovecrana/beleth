package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ContainerStateRunning is a running state of a container.
 */
public class ContainerStateRunning {
  public String startedAt;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public ContainerStateRunning startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }
}
