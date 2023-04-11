package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * ContainerStatus contains details for the current status of this container.
 */
public class ContainerStatus {
  public String containerID;

  public String image;

  public String imageID;

  public ContainerState lastState;

  public String name;

  public Boolean ready;

  public Long restartCount;

  public Boolean started;

  public ContainerState state;

  /**
   * Container&#39;s ID in the format &#39;&#60;type&#62;://&#60;container_id&#62;&#39;.
   */
  public ContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
   */
  public ContainerStatus image(String image) {
    this.image = image;
    return this;
  }

  /**
   * ImageID of the container&#39;s image.
   */
  public ContainerStatus imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

  public ContainerStatus lastState(ContainerState lastState) {
    this.lastState = lastState;
    return this;
  }

  /**
   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
   */
  public ContainerStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies whether the container has passed its readiness probe.
   */
  public ContainerStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

  /**
   * The number of times the container has been restarted.
   */
  public ContainerStatus restartCount(Long restartCount) {
    this.restartCount = restartCount;
    return this;
  }

  /**
   * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
   */
  public ContainerStatus started(Boolean started) {
    this.started = started;
    return this;
  }

  public ContainerStatus state(ContainerState state) {
    this.state = state;
    return this;
  }
}
