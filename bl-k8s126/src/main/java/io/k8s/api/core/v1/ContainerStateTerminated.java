package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;

/**
 * ContainerStateTerminated is a terminated state of a container.
 */
public class ContainerStateTerminated {
  public String containerID;

  public Long exitCode;

  public String finishedAt;

  public String message;

  public String reason;

  public Long signal;

  public String startedAt;

  /**
   * Container&#39;s ID in the format &#39;&#60;type&#62;://&#60;container_id&#62;&#39;
   */
  public ContainerStateTerminated containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * Exit status from the last termination of the container
   */
  public ContainerStateTerminated exitCode(Long exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public ContainerStateTerminated finishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Message regarding the last termination of the container
   */
  public ContainerStateTerminated message(String message) {
    this.message = message;
    return this;
  }

  /**
   * (brief) reason from the last termination of the container
   */
  public ContainerStateTerminated reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Signal from the last termination of the container
   */
  public ContainerStateTerminated signal(Long signal) {
    this.signal = signal;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public ContainerStateTerminated startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  public static ContainerStateTerminated containerStateTerminated() {
    return new ContainerStateTerminated();
  }
}
