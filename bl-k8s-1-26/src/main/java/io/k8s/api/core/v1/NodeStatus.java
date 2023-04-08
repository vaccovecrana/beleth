
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * NodeStatus is information about the current status of a node.
 * 
 */
public class NodeStatus {

    /**
     * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example.
     * 
     */
    public List<NodeAddress> addresses;
    /**
     * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
     * 
     */
    public Allocatable allocatable;
    /**
     * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     * 
     */
    public Capacity__1 capacity;
    /**
     * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
     * 
     */
    public List<NodeCondition> conditions;
    /**
     * NodeConfigStatus describes the status of the config assigned by Node.Spec.ConfigSource.
     * 
     */
    public NodeConfigStatus config;
    /**
     * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
     * 
     */
    public NodeDaemonEndpoints daemonEndpoints;
    /**
     * List of container images on this node
     * 
     */
    public List<ContainerImage> images;
    /**
     * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
     * 
     */
    public NodeSystemInfo nodeInfo;
    /**
     * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
     * 
     * Possible enum values:
     *  - `"Pending"` means the node has been created/added by the system, but not configured.
     *  - `"Running"` means the node has been configured and has Kubernetes components running.
     *  - `"Terminated"` means the node has been removed from the cluster.
     * 
     */
    public NodeStatus.Phase phase;
    /**
     * List of volumes that are attached to the node.
     * 
     */
    public List<AttachedVolume> volumesAttached;
    /**
     * List of attachable volumes in use (mounted) by the node.
     * 
     */
    public List<String> volumesInUse;

    public NodeStatus withAddresses(List<NodeAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public NodeStatus withAllocatable(Allocatable allocatable) {
        this.allocatable = allocatable;
        return this;
    }

    public NodeStatus withCapacity(Capacity__1 capacity) {
        this.capacity = capacity;
        return this;
    }

    public NodeStatus withConditions(List<NodeCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public NodeStatus withConfig(NodeConfigStatus config) {
        this.config = config;
        return this;
    }

    public NodeStatus withDaemonEndpoints(NodeDaemonEndpoints daemonEndpoints) {
        this.daemonEndpoints = daemonEndpoints;
        return this;
    }

    public NodeStatus withImages(List<ContainerImage> images) {
        this.images = images;
        return this;
    }

    public NodeStatus withNodeInfo(NodeSystemInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public NodeStatus withPhase(NodeStatus.Phase phase) {
        this.phase = phase;
        return this;
    }

    public NodeStatus withVolumesAttached(List<AttachedVolume> volumesAttached) {
        this.volumesAttached = volumesAttached;
        return this;
    }

    public NodeStatus withVolumesInUse(List<String> volumesInUse) {
        this.volumesInUse = volumesInUse;
        return this;
    }


    /**
     * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
     * 
     * Possible enum values:
     *  - `"Pending"` means the node has been created/added by the system, but not configured.
     *  - `"Running"` means the node has been configured and has Kubernetes components running.
     *  - `"Terminated"` means the node has been removed from the cluster.
     * 
     */
    public enum Phase {

        PENDING("Pending"),
        RUNNING("Running"),
        TERMINATED("Terminated");
        private final String value;
        private final static Map<String, NodeStatus.Phase> CONSTANTS = new HashMap<String, NodeStatus.Phase>();

        static {
            for (NodeStatus.Phase c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Phase(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NodeStatus.Phase fromValue(String value) {
            NodeStatus.Phase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
