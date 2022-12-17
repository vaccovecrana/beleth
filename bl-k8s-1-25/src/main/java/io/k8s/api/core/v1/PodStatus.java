
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
 * 
 */
public class PodStatus {

    /**
     * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    public List<PodCondition> conditions;
    /**
     * The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    public List<ContainerStatus> containerStatuses;
    /**
     * Status for any ephemeral containers that have run in this pod.
     * 
     */
    public List<ContainerStatus> ephemeralContainerStatuses;
    /**
     * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    public String hostIP;
    /**
     * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    public List<ContainerStatus> initContainerStatuses;
    /**
     * A human readable message indicating details about why the pod is in this condition.
     * 
     */
    public String message;
    /**
     * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    public String nominatedNodeName;
    /**
     * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     * Possible enum values:
     *  - `"Failed"` means that all containers in the pod have terminated, and at least one container has terminated in a failure (exited with a non-zero exit code or was stopped by the system).
     *  - `"Pending"` means the pod has been accepted by the system, but one or more of the containers has not been started. This includes time before being bound to a node, as well as time spent pulling images onto the host.
     *  - `"Running"` means the pod has been bound to a node and all of the containers have been started. At least one container is still running or is in the process of being restarted.
     *  - `"Succeeded"` means that all containers in the pod have voluntarily terminated with a container exit code of 0, and the system is not going to restart any of these containers.
     *  - `"Unknown"` means that for some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod. Deprecated: It isn't being set since 2015 (74da3b14b0c0f658b3bb8d2def5094686d0e9095)
     * 
     */
    public PodStatus.Phase phase;
    /**
     * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    public String podIP;
    /**
     * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    public List<PodIP> podIPs;
    /**
     * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     * Possible enum values:
     *  - `"BestEffort"` is the BestEffort qos class.
     *  - `"Burstable"` is the Burstable qos class.
     *  - `"Guaranteed"` is the Guaranteed qos class.
     * 
     */
    public PodStatus.QosClass qosClass;
    /**
     * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
     * 
     */
    public String reason;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String startTime;

    public PodStatus withConditions(List<PodCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PodStatus withContainerStatuses(List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
        return this;
    }

    public PodStatus withEphemeralContainerStatuses(List<ContainerStatus> ephemeralContainerStatuses) {
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
        return this;
    }

    public PodStatus withHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    public PodStatus withInitContainerStatuses(List<ContainerStatus> initContainerStatuses) {
        this.initContainerStatuses = initContainerStatuses;
        return this;
    }

    public PodStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    public PodStatus withNominatedNodeName(String nominatedNodeName) {
        this.nominatedNodeName = nominatedNodeName;
        return this;
    }

    public PodStatus withPhase(PodStatus.Phase phase) {
        this.phase = phase;
        return this;
    }

    public PodStatus withPodIP(String podIP) {
        this.podIP = podIP;
        return this;
    }

    public PodStatus withPodIPs(List<PodIP> podIPs) {
        this.podIPs = podIPs;
        return this;
    }

    public PodStatus withQosClass(PodStatus.QosClass qosClass) {
        this.qosClass = qosClass;
        return this;
    }

    public PodStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public PodStatus withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     * Possible enum values:
     *  - `"Failed"` means that all containers in the pod have terminated, and at least one container has terminated in a failure (exited with a non-zero exit code or was stopped by the system).
     *  - `"Pending"` means the pod has been accepted by the system, but one or more of the containers has not been started. This includes time before being bound to a node, as well as time spent pulling images onto the host.
     *  - `"Running"` means the pod has been bound to a node and all of the containers have been started. At least one container is still running or is in the process of being restarted.
     *  - `"Succeeded"` means that all containers in the pod have voluntarily terminated with a container exit code of 0, and the system is not going to restart any of these containers.
     *  - `"Unknown"` means that for some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod. Deprecated: It isn't being set since 2015 (74da3b14b0c0f658b3bb8d2def5094686d0e9095)
     * 
     */
    public enum Phase {

        FAILED("Failed"),
        PENDING("Pending"),
        RUNNING("Running"),
        SUCCEEDED("Succeeded"),
        UNKNOWN("Unknown");
        private final String value;
        private final static Map<String, PodStatus.Phase> CONSTANTS = new HashMap<String, PodStatus.Phase>();

        static {
            for (PodStatus.Phase c: values()) {
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

        public static PodStatus.Phase fromValue(String value) {
            PodStatus.Phase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     * Possible enum values:
     *  - `"BestEffort"` is the BestEffort qos class.
     *  - `"Burstable"` is the Burstable qos class.
     *  - `"Guaranteed"` is the Guaranteed qos class.
     * 
     */
    public enum QosClass {

        BEST_EFFORT("BestEffort"),
        BURSTABLE("Burstable"),
        GUARANTEED("Guaranteed");
        private final String value;
        private final static Map<String, PodStatus.QosClass> CONSTANTS = new HashMap<String, PodStatus.QosClass>();

        static {
            for (PodStatus.QosClass c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        QosClass(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PodStatus.QosClass fromValue(String value) {
            PodStatus.QosClass constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
