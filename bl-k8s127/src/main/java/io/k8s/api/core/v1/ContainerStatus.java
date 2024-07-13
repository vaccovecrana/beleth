package io.k8s.api.core.v1;

import io.k8s.api.core.v1.containerstatus.AllocatedResources;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * ContainerStatus contains details for the current status of this container.
 */
public class ContainerStatus {
  public AllocatedResources allocatedResources;

  public String containerID;

  public String image;

  public String imageID;

  public ContainerState lastState;

  public String name;

  public Boolean ready;

  public ResourceRequirements resources;

  public Long restartCount;

  public Boolean started;

  public ContainerState state;

  /**
   * AllocatedResources represents the compute resources allocated for this container by the node. Kubelet sets this value to Container.Resources.Requests upon successful pod admission and after successfully admitting desired pod resize.
   */
  public ContainerStatus allocatedResources(AllocatedResources allocatedResources) {
    this.allocatedResources = allocatedResources;
    return this;
  }

  /**
   * ContainerID is the ID of the container in the format &#39;&#60;type&#62;://&#60;container_id&#62;&#39;. Where type is a container runtime identifier, returned from Version call of CRI API (for example &#34;containerd&#34;).
   */
  public ContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * Image is the name of container image that the container is running. The container image may not match the image used in the PodSpec, as it may have been resolved by the runtime. More info: https://kubernetes.io/docs/concepts/containers/images.
   */
  public ContainerStatus image(String image) {
    this.image = image;
    return this;
  }

  /**
   * ImageID is the image ID of the container&#39;s image. The image ID may not match the image ID of the image used in the PodSpec, as it may have been resolved by the runtime.
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
   * Name is a DNS_LABEL representing the unique name of the container. Each container in a pod must have a unique name across all container types. Cannot be updated.
   */
  public ContainerStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Ready specifies whether the container is currently passing its readiness check. The value will change as readiness probes keep executing. If no readiness probes are specified, this field defaults to true once the container is fully started (see Started field).
   *
   * The value is typically used to determine whether a container is ready to accept traffic.
   */
  public ContainerStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

  public ContainerStatus resources(ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  /**
   * RestartCount holds the number of times the container has been restarted. Kubelet makes an effort to always increment the value, but there are cases when the state may be lost due to node restarts and then the value may be reset to 0. The value is never negative.
   */
  public ContainerStatus restartCount(Long restartCount) {
    this.restartCount = restartCount;
    return this;
  }

  /**
   * Started indicates whether the container has finished its postStart lifecycle hook and passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. In both cases, startup probes will run again. Is always true when no startupProbe is defined and container is running and has passed the postStart lifecycle hook. The null value must be treated the same as false.
   */
  public ContainerStatus started(Boolean started) {
    this.started = started;
    return this;
  }

  public ContainerStatus state(ContainerState state) {
    this.state = state;
    return this;
  }

  public static ContainerStatus containerStatus() {
    return new ContainerStatus();
  }
}
