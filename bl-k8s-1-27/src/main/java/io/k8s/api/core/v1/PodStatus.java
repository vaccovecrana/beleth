package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
 */
public class PodStatus {
  public List<PodCondition> conditions;

  public List<ContainerStatus> containerStatuses;

  public List<ContainerStatus> ephemeralContainerStatuses;

  public String hostIP;

  public List<ContainerStatus> initContainerStatuses;

  public String message;

  public String nominatedNodeName;

  public String phase;

  public String podIP;

  public List<PodIP> podIPs;

  public String qosClass;

  public String reason;

  public String resize;

  public String startTime;

  /**
   * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   */
  public PodStatus conditions(List<PodCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   */
  public PodStatus containerStatuses(List<ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
    return this;
  }

  /**
   * Status for any ephemeral containers that have run in this pod.
   */
  public PodStatus ephemeralContainerStatuses(List<ContainerStatus> ephemeralContainerStatuses) {
    this.ephemeralContainerStatuses = ephemeralContainerStatuses;
    return this;
  }

  /**
   * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
   */
  public PodStatus hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

  /**
   * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   */
  public PodStatus initContainerStatuses(List<ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
    return this;
  }

  /**
   * A human readable message indicating details about why the pod is in this condition.
   */
  public PodStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
   */
  public PodStatus nominatedNodeName(String nominatedNodeName) {
    this.nominatedNodeName = nominatedNodeName;
    return this;
  }

  /**
   * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:
   *
   * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
   *
   * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
   */
  public PodStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
   */
  public PodStatus podIP(String podIP) {
    this.podIP = podIP;
    return this;
  }

  /**
   * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
   */
  public PodStatus podIPs(List<PodIP> podIPs) {
    this.podIPs = podIPs;
    return this;
  }

  /**
   * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-qos/#quality-of-service-classes
   */
  public PodStatus qosClass(String qosClass) {
    this.qosClass = qosClass;
    return this;
  }

  /**
   * A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
   */
  public PodStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of resources resize desired for pod&#39;s containers. It is empty if no resources resize is pending. Any changes to container resources will automatically set this to &#34;Proposed&#34;
   */
  public PodStatus resize(String resize) {
    this.resize = resize;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public PodStatus startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }
}
