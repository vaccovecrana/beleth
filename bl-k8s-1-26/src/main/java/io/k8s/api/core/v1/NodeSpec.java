
package io.k8s.api.core.v1;

import java.util.List;


/**
 * NodeSpec describes the attributes that a node is created with.
 * 
 */
public class NodeSpec {

    /**
     * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22
     * 
     */
    public NodeConfigSource configSource;
    /**
     * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
     * 
     */
    public String externalID;
    /**
     * PodCIDR represents the pod IP range assigned to the node.
     * 
     */
    public String podCIDR;
    /**
     * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
     * 
     */
    public List<String> podCIDRs;
    /**
     * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
     * 
     */
    public String providerID;
    /**
     * If specified, the node's taints.
     * 
     */
    public List<Taint> taints;
    /**
     * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
     * 
     */
    public Boolean unschedulable;

    public NodeSpec withConfigSource(NodeConfigSource configSource) {
        this.configSource = configSource;
        return this;
    }

    public NodeSpec withExternalID(String externalID) {
        this.externalID = externalID;
        return this;
    }

    public NodeSpec withPodCIDR(String podCIDR) {
        this.podCIDR = podCIDR;
        return this;
    }

    public NodeSpec withPodCIDRs(List<String> podCIDRs) {
        this.podCIDRs = podCIDRs;
        return this;
    }

    public NodeSpec withProviderID(String providerID) {
        this.providerID = providerID;
        return this;
    }

    public NodeSpec withTaints(List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public NodeSpec withUnschedulable(Boolean unschedulable) {
        this.unschedulable = unschedulable;
        return this;
    }

}
