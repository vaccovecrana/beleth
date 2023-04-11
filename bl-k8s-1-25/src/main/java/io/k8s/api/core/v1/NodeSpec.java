package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * NodeSpec describes the attributes that a node is created with.
 */
public class NodeSpec {
  public NodeConfigSource configSource;

  public String externalID;

  public String podCIDR;

  public List<String> podCIDRs;

  public String providerID;

  public List<Taint> taints;

  public Boolean unschedulable;

  public NodeSpec configSource(NodeConfigSource configSource) {
    this.configSource = configSource;
    return this;
  }

  /**
   * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
   */
  public NodeSpec externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

  /**
   * PodCIDR represents the pod IP range assigned to the node.
   */
  public NodeSpec podCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
    return this;
  }

  /**
   * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
   */
  public NodeSpec podCIDRs(List<String> podCIDRs) {
    this.podCIDRs = podCIDRs;
    return this;
  }

  /**
   * ID of the node assigned by the cloud provider in the format: &#60;ProviderName&#62;://&#60;ProviderSpecificNodeID&#62;
   */
  public NodeSpec providerID(String providerID) {
    this.providerID = providerID;
    return this;
  }

  /**
   * If specified, the node&#39;s taints.
   */
  public NodeSpec taints(List<Taint> taints) {
    this.taints = taints;
    return this;
  }

  /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
   */
  public NodeSpec unschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
    return this;
  }
}
