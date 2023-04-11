package io.k8s.api.core.v1;

import io.k8s.api.core.v1.nodestatus.Allocatable;
import io.k8s.api.core.v1.nodestatus.Capacity;
import io.k8s.api.core.v1.nodestatus.Phase;
import java.lang.String;
import java.util.List;

/**
 * NodeStatus is information about the current status of a node.
 */
public class NodeStatus {
  public List<NodeAddress> addresses;

  public Allocatable allocatable;

  public Capacity capacity;

  public List<NodeCondition> conditions;

  public NodeConfigStatus config;

  public NodeDaemonEndpoints daemonEndpoints;

  public List<ContainerImage> images;

  public NodeSystemInfo nodeInfo;

  public Phase phase;

  public List<AttachedVolume> volumesAttached;

  public List<String> volumesInUse;

  /**
   * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
   */
  public NodeStatus addresses(List<NodeAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  /**
   * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
   */
  public NodeStatus allocatable(Allocatable allocatable) {
    this.allocatable = allocatable;
    return this;
  }

  /**
   * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   */
  public NodeStatus capacity(Capacity capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
   */
  public NodeStatus conditions(List<NodeCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public NodeStatus config(NodeConfigStatus config) {
    this.config = config;
    return this;
  }

  public NodeStatus daemonEndpoints(NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
    return this;
  }

  /**
   * List of container images on this node
   */
  public NodeStatus images(List<ContainerImage> images) {
    this.images = images;
    return this;
  }

  public NodeStatus nodeInfo(NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  /**
   * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
   *
   * Possible enum values:
   *  - `&#34;Pending&#34;` means the node has been created/added by the system, but not configured.
   *  - `&#34;Running&#34;` means the node has been configured and has Kubernetes components running.
   *  - `&#34;Terminated&#34;` means the node has been removed from the cluster.
   */
  public NodeStatus phase(Phase phase) {
    this.phase = phase;
    return this;
  }

  /**
   * List of volumes that are attached to the node.
   */
  public NodeStatus volumesAttached(List<AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
    return this;
  }

  /**
   * List of attachable volumes in use (mounted) by the node.
   */
  public NodeStatus volumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
    return this;
  }
}
