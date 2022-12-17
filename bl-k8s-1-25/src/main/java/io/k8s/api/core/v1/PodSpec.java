
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * PodSpec is a description of a pod.
 * 
 */
public class PodSpec {

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
     * 
     */
    public Integer activeDeadlineSeconds;
    /**
     * Affinity is a group of affinity scheduling rules.
     * 
     */
    public Affinity affinity;
    /**
     * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
     * 
     */
    public Boolean automountServiceAccountToken;
    /**
     * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
     * (Required)
     * 
     */
    public List<Container> containers;
    /**
     * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
     * 
     */
    public PodDNSConfig dnsConfig;
    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     * 
     * Possible enum values:
     *  - `"ClusterFirst"` indicates that the pod should use cluster DNS first unless hostNetwork is true, if it is available, then fall back on the default (as determined by kubelet) DNS settings.
     *  - `"ClusterFirstWithHostNet"` indicates that the pod should use cluster DNS first, if it is available, then fall back on the default (as determined by kubelet) DNS settings.
     *  - `"Default"` indicates that the pod should use the default (as determined by kubelet) DNS settings.
     *  - `"None"` indicates that the pod should use empty DNS settings. DNS parameters such as nameservers and search paths should be defined via DNSConfig.
     * 
     */
    public PodSpec.DnsPolicy dnsPolicy;
    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
     * 
     */
    public Boolean enableServiceLinks;
    /**
     * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource.
     * 
     */
    public List<EphemeralContainer> ephemeralContainers;
    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
     * 
     */
    public List<HostAlias> hostAliases;
    /**
     * Use the host's ipc namespace. Optional: Default to false.
     * 
     */
    public Boolean hostIPC;
    /**
     * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
     * 
     */
    public Boolean hostNetwork;
    /**
     * Use the host's pid namespace. Optional: Default to false.
     * 
     */
    public Boolean hostPID;
    /**
     * Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
     * 
     */
    public Boolean hostUsers;
    /**
     * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
     * 
     */
    public String hostname;
    /**
     * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
     * 
     */
    public List<LocalObjectReference> imagePullSecrets;
    /**
     * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
     * 
     */
    public List<Container> initContainers;
    /**
     * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
     * 
     */
    public String nodeName;
    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    public NodeSelector__1 nodeSelector;
    /**
     * PodOS defines the OS parameters of a pod.
     * 
     */
    public PodOS os;
    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
     * 
     */
    public Overhead overhead;
    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
     * 
     */
    public String preemptionPolicy;
    /**
     * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
     * 
     */
    public Integer priority;
    /**
     * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
     * 
     */
    public String priorityClassName;
    /**
     * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
     * 
     */
    public List<PodReadinessGate> readinessGates;
    /**
     * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
     * 
     * Possible enum values:
     *  - `"Always"`
     *  - `"Never"`
     *  - `"OnFailure"`
     * 
     */
    public PodSpec.RestartPolicy restartPolicy;
    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
     * 
     */
    public String runtimeClassName;
    /**
     * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
     * 
     */
    public String schedulerName;
    /**
     * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
     * 
     */
    public PodSecurityContext securityContext;
    /**
     * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
     * 
     */
    public String serviceAccount;
    /**
     * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     * 
     */
    public String serviceAccountName;
    /**
     * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
     * 
     */
    public Boolean setHostnameAsFQDN;
    /**
     * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
     * 
     */
    public Boolean shareProcessNamespace;
    /**
     * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
     * 
     */
    public String subdomain;
    /**
     * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
     * 
     */
    public Integer terminationGracePeriodSeconds;
    /**
     * If specified, the pod's tolerations.
     * 
     */
    public List<Toleration> tolerations;
    /**
     * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
     * 
     */
    public List<TopologySpreadConstraint> topologySpreadConstraints;
    /**
     * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
     * 
     */
    public List<Volume> volumes;

    public PodSpec withActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }

    public PodSpec withAffinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public PodSpec withAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }

    public PodSpec withContainers(List<Container> containers) {
        this.containers = containers;
        return this;
    }

    public PodSpec withDnsConfig(PodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    public PodSpec withDnsPolicy(PodSpec.DnsPolicy dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }

    public PodSpec withEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
        return this;
    }

    public PodSpec withEphemeralContainers(List<EphemeralContainer> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
        return this;
    }

    public PodSpec withHostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }

    public PodSpec withHostIPC(Boolean hostIPC) {
        this.hostIPC = hostIPC;
        return this;
    }

    public PodSpec withHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public PodSpec withHostPID(Boolean hostPID) {
        this.hostPID = hostPID;
        return this;
    }

    public PodSpec withHostUsers(Boolean hostUsers) {
        this.hostUsers = hostUsers;
        return this;
    }

    public PodSpec withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public PodSpec withImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }

    public PodSpec withInitContainers(List<Container> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    public PodSpec withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public PodSpec withNodeSelector(NodeSelector__1 nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public PodSpec withOs(PodOS os) {
        this.os = os;
        return this;
    }

    public PodSpec withOverhead(Overhead overhead) {
        this.overhead = overhead;
        return this;
    }

    public PodSpec withPreemptionPolicy(String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
        return this;
    }

    public PodSpec withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public PodSpec withPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
        return this;
    }

    public PodSpec withReadinessGates(List<PodReadinessGate> readinessGates) {
        this.readinessGates = readinessGates;
        return this;
    }

    public PodSpec withRestartPolicy(PodSpec.RestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    public PodSpec withRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
        return this;
    }

    public PodSpec withSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public PodSpec withSecurityContext(PodSecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    public PodSpec withServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    public PodSpec withServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    public PodSpec withSetHostnameAsFQDN(Boolean setHostnameAsFQDN) {
        this.setHostnameAsFQDN = setHostnameAsFQDN;
        return this;
    }

    public PodSpec withShareProcessNamespace(Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
        return this;
    }

    public PodSpec withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    public PodSpec withTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }

    public PodSpec withTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    public PodSpec withTopologySpreadConstraints(List<TopologySpreadConstraint> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
        return this;
    }

    public PodSpec withVolumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }


    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     * 
     * Possible enum values:
     *  - `"ClusterFirst"` indicates that the pod should use cluster DNS first unless hostNetwork is true, if it is available, then fall back on the default (as determined by kubelet) DNS settings.
     *  - `"ClusterFirstWithHostNet"` indicates that the pod should use cluster DNS first, if it is available, then fall back on the default (as determined by kubelet) DNS settings.
     *  - `"Default"` indicates that the pod should use the default (as determined by kubelet) DNS settings.
     *  - `"None"` indicates that the pod should use empty DNS settings. DNS parameters such as nameservers and search paths should be defined via DNSConfig.
     * 
     */
    public enum DnsPolicy {

        CLUSTER_FIRST("ClusterFirst"),
        CLUSTER_FIRST_WITH_HOST_NET("ClusterFirstWithHostNet"),
        DEFAULT("Default"),
        NONE("None");
        private final String value;
        private final static Map<String, PodSpec.DnsPolicy> CONSTANTS = new HashMap<String, PodSpec.DnsPolicy>();

        static {
            for (PodSpec.DnsPolicy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DnsPolicy(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PodSpec.DnsPolicy fromValue(String value) {
            PodSpec.DnsPolicy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
     * 
     * Possible enum values:
     *  - `"Always"`
     *  - `"Never"`
     *  - `"OnFailure"`
     * 
     */
    public enum RestartPolicy {

        ALWAYS("Always"),
        NEVER("Never"),
        ON_FAILURE("OnFailure");
        private final String value;
        private final static Map<String, PodSpec.RestartPolicy> CONSTANTS = new HashMap<String, PodSpec.RestartPolicy>();

        static {
            for (PodSpec.RestartPolicy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RestartPolicy(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PodSpec.RestartPolicy fromValue(String value) {
            PodSpec.RestartPolicy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
