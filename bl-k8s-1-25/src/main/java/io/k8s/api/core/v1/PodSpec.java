package io.k8s.api.core.v1;

import io.k8s.api.core.v1.podspec.NodeSelector;
import io.k8s.api.core.v1.podspec.Overhead;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * PodSpec is a description of a pod.
 */
public class PodSpec {
  public Long activeDeadlineSeconds;

  public Affinity affinity;

  public Boolean automountServiceAccountToken;

  public List<Container> containers;

  public PodDNSConfig dnsConfig;

  public String dnsPolicy;

  public Boolean enableServiceLinks;

  public List<EphemeralContainer> ephemeralContainers;

  public List<HostAlias> hostAliases;

  public Boolean hostIPC;

  public Boolean hostNetwork;

  public Boolean hostPID;

  public Boolean hostUsers;

  public String hostname;

  public List<LocalObjectReference> imagePullSecrets;

  public List<Container> initContainers;

  public String nodeName;

  public NodeSelector nodeSelector;

  public PodOS os;

  public Overhead overhead;

  public String preemptionPolicy;

  public Long priority;

  public String priorityClassName;

  public List<PodReadinessGate> readinessGates;

  public String restartPolicy;

  public String runtimeClassName;

  public String schedulerName;

  public PodSecurityContext securityContext;

  public String serviceAccount;

  public String serviceAccountName;

  public Boolean setHostnameAsFQDN;

  public Boolean shareProcessNamespace;

  public String subdomain;

  public Long terminationGracePeriodSeconds;

  public List<Toleration> tolerations;

  public List<TopologySpreadConstraint> topologySpreadConstraints;

  public List<Volume> volumes;

  /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
   */
  public PodSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

  public PodSpec affinity(Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

  /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
   */
  public PodSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

  /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
   */
  public PodSpec containers(List<Container> containers) {
    this.containers = containers;
    return this;
  }

  public PodSpec dnsConfig(PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
    return this;
  }

  /**
   * Set DNS policy for the pod. Defaults to &#34;ClusterFirst&#34;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;.
   *
   */
  public PodSpec dnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return this;
  }

  /**
   * EnableServiceLinks indicates whether information about services should be injected into pod&#39;s environment variables, matching the syntax of Docker links. Optional: Defaults to true.
   */
  public PodSpec enableServiceLinks(Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
    return this;
  }

  /**
   * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod&#39;s ephemeralcontainers subresource.
   */
  public PodSpec ephemeralContainers(List<EphemeralContainer> ephemeralContainers) {
    this.ephemeralContainers = ephemeralContainers;
    return this;
  }

  /**
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod&#39;s hosts file if specified. This is only valid for non-hostNetwork pods.
   */
  public PodSpec hostAliases(List<HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
    return this;
  }

  /**
   * Use the host&#39;s ipc namespace. Optional: Default to false.
   */
  public PodSpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

  /**
   * Host networking requested for this pod. Use the host&#39;s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
   */
  public PodSpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

  /**
   * Use the host&#39;s pid namespace. Optional: Default to false.
   */
  public PodSpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

  /**
   * Use the host&#39;s user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
   */
  public PodSpec hostUsers(Boolean hostUsers) {
    this.hostUsers = hostUsers;
    return this;
  }

  /**
   * Specifies the hostname of the Pod If not specified, the pod&#39;s hostname will be set to a system-defined value.
   */
  public PodSpec hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   */
  public PodSpec imagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  /**
   * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
   */
  public PodSpec initContainers(List<Container> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  /**
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
   */
  public PodSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   */
  public PodSpec nodeSelector(NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public PodSpec os(PodOS os) {
    this.os = os;
    return this;
  }

  /**
   * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
   */
  public PodSpec overhead(Overhead overhead) {
    this.overhead = overhead;
    return this;
  }

  /**
   * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
   */
  public PodSpec preemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return this;
  }

  /**
   * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
   */
  public PodSpec priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * If specified, indicates the pod&#39;s priority. &#34;system-node-critical&#34; and &#34;system-cluster-critical&#34; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
   */
  public PodSpec priorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return this;
  }

  /**
   * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to &#34;True&#34; More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
   */
  public PodSpec readinessGates(List<PodReadinessGate> readinessGates) {
    this.readinessGates = readinessGates;
    return this;
  }

  /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
   *
   */
  public PodSpec restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the &#34;legacy&#34; RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
   */
  public PodSpec runtimeClassName(String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
    return this;
  }

  /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   */
  public PodSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

  public PodSpec securityContext(PodSecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

  /**
   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
   */
  public PodSpec serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   */
  public PodSpec serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * If true the pod&#39;s hostname will be configured as the pod&#39;s FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
   */
  public PodSpec setHostnameAsFQDN(Boolean setHostnameAsFQDN) {
    this.setHostnameAsFQDN = setHostnameAsFQDN;
    return this;
  }

  /**
   * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
   */
  public PodSpec shareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
    return this;
  }

  /**
   * If specified, the fully qualified Pod hostname will be &#34;&#60;hostname&#62;.&#60;subdomain&#62;.&#60;pod namespace&#62;.svc.&#60;cluster domain&#62;&#34;. If not specified, the pod will not have a domainname at all.
   */
  public PodSpec subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

  /**
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
   */
  public PodSpec terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

  /**
   * If specified, the pod&#39;s tolerations.
   */
  public PodSpec tolerations(List<Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  /**
   * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
   */
  public PodSpec topologySpreadConstraints(
      List<TopologySpreadConstraint> topologySpreadConstraints) {
    this.topologySpreadConstraints = topologySpreadConstraints;
    return this;
  }

  /**
   * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
   */
  public PodSpec volumes(List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }
}
