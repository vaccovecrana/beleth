package io.k8s.api.core.v1;

import io.k8s.api.core.v1.servicespec.Selector;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * ServiceSpec describes the attributes that a user creates on a service.
 */
public class ServiceSpec {
  public Boolean allocateLoadBalancerNodePorts;

  public String clusterIP;

  public List<String> clusterIPs;

  public List<String> externalIPs;

  public String externalName;

  public String externalTrafficPolicy;

  public Long healthCheckNodePort;

  public String internalTrafficPolicy;

  public List<String> ipFamilies;

  public String ipFamilyPolicy;

  public String loadBalancerClass;

  public String loadBalancerIP;

  public List<String> loadBalancerSourceRanges;

  public List<ServicePort> ports;

  public Boolean publishNotReadyAddresses;

  public Selector selector;

  public String sessionAffinity;

  public SessionAffinityConfig sessionAffinityConfig;

  public String type;

  /**
   * allocateLoadBalancerNodePorts defines if NodePorts will be automatically allocated for services with type LoadBalancer.  Default is &#34;true&#34;. It may be set to &#34;false&#34; if the cluster load-balancer does not rely on NodePorts.  If the caller requests specific NodePorts (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type LoadBalancer and will be cleared if the type is changed to any other type.
   */
  public ServiceSpec allocateLoadBalancerNodePorts(Boolean allocateLoadBalancerNodePorts) {
    this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
    return this;
  }

  /**
   * clusterIP is the IP address of the service and is usually assigned randomly. If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be blank) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are &#34;None&#34;, empty string (&#34;&#34;), or a valid IP address. Setting this to &#34;None&#34; makes a &#34;headless service&#34; (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   */
  public ServiceSpec clusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
    return this;
  }

  /**
   * ClusterIPs is a list of IP addresses assigned to this service, and are usually assigned randomly.  If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be empty) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are &#34;None&#34;, empty string (&#34;&#34;), or a valid IP address.  Setting this to &#34;None&#34; makes a &#34;headless service&#34; (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName.  If this field is not specified, it will be initialized from the clusterIP field.  If this field is specified, clients must ensure that clusterIPs[0] and clusterIP have the same value.
   *
   * This field may hold a maximum of two entries (dual-stack IPs, in either order). These IPs must correspond to the values of the ipFamilies field. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   */
  public ServiceSpec clusterIPs(List<String> clusterIPs) {
    this.clusterIPs = clusterIPs;
    return this;
  }

  /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
   */
  public ServiceSpec externalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
    return this;
  }

  /**
   * externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). No proxying will be involved.  Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires `type` to be &#34;ExternalName&#34;.
   */
  public ServiceSpec externalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

  /**
   * externalTrafficPolicy describes how nodes distribute service traffic they receive on one of the Service&#39;s &#34;externally-facing&#34; addresses (NodePorts, ExternalIPs, and LoadBalancer IPs). If set to &#34;Local&#34;, the proxy will configure the service in a way that assumes that external load balancers will take care of balancing the service traffic between nodes, and so each node will deliver traffic only to the node-local endpoints of the service, without masquerading the client source IP. (Traffic mistakenly sent to a node with no endpoints will be dropped.) The default value, &#34;Cluster&#34;, uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features). Note that traffic sent to an External IP or LoadBalancer IP from within the cluster will always get &#34;Cluster&#34; semantics, but clients sending to a NodePort from within the cluster may need to take traffic policy into account when picking a node.
   */
  public ServiceSpec externalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
    return this;
  }

  /**
   * healthCheckNodePort specifies the healthcheck nodePort for the service. This only applies when type is set to LoadBalancer and externalTrafficPolicy is set to Local. If a value is specified, is in-range, and is not in use, it will be used.  If not specified, a value will be automatically allocated.  External systems (e.g. load-balancers) can use this port to determine if a given node holds endpoints for this service or not.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type). This field cannot be updated once set.
   */
  public ServiceSpec healthCheckNodePort(Long healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
    return this;
  }

  /**
   * InternalTrafficPolicy describes how nodes distribute service traffic they receive on the ClusterIP. If set to &#34;Local&#34;, the proxy will assume that pods only want to talk to endpoints of the service on the same node as the pod, dropping the traffic if there are no local endpoints. The default value, &#34;Cluster&#34;, uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features).
   */
  public ServiceSpec internalTrafficPolicy(String internalTrafficPolicy) {
    this.internalTrafficPolicy = internalTrafficPolicy;
    return this;
  }

  /**
   * IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service. Valid values are &#34;IPv4&#34; and &#34;IPv6&#34;.  This field only applies to Services of types ClusterIP, NodePort, and LoadBalancer, and does apply to &#34;headless&#34; services. This field will be wiped when updating a Service to type ExternalName.
   *
   * This field may hold a maximum of two entries (dual-stack families, in either order).  These families must correspond to the values of the clusterIPs field, if specified. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field.
   */
  public ServiceSpec ipFamilies(List<String> ipFamilies) {
    this.ipFamilies = ipFamilies;
    return this;
  }

  /**
   * IPFamilyPolicy represents the dual-stack-ness requested or required by this Service. If there is no value provided, then this field will be set to SingleStack. Services can be &#34;SingleStack&#34; (a single IP family), &#34;PreferDualStack&#34; (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or &#34;RequireDualStack&#34; (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field. This field will be wiped when updating a service to type ExternalName.
   */
  public ServiceSpec ipFamilyPolicy(String ipFamilyPolicy) {
    this.ipFamilyPolicy = ipFamilyPolicy;
    return this;
  }

  /**
   * loadBalancerClass is the class of the load balancer implementation this Service belongs to. If specified, the value of this field must be a label-style identifier, with an optional prefix, e.g. &#34;internal-vip&#34; or &#34;example.com/internal-vip&#34;. Unprefixed names are reserved for end-users. This field can only be set when the Service type is &#39;LoadBalancer&#39;. If not set, the default load balancer implementation is used, today this is typically done through the cloud provider integration, but should apply for any default implementation. If set, it is assumed that a load balancer implementation is watching for Services with a matching class. Any default load balancer implementation (e.g. cloud providers) should ignore Services that set this field. This field can only be set when creating or updating a Service to type &#39;LoadBalancer&#39;. Once set, it can not be changed. This field will be wiped when a service is updated to a non &#39;LoadBalancer&#39; type.
   */
  public ServiceSpec loadBalancerClass(String loadBalancerClass) {
    this.loadBalancerClass = loadBalancerClass;
    return this;
  }

  /**
   * Only applies to Service Type: LoadBalancer. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature. Deprecated: This field was under-specified and its meaning varies across implementations. Using it is non-portable and it may not support dual-stack. Users are encouraged to use implementation-specific annotations when available.
   */
  public ServiceSpec loadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
    return this;
  }

  /**
   * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.&#34; More info: https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/
   */
  public ServiceSpec loadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  /**
   * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   */
  public ServiceSpec ports(List<ServicePort> ports) {
    this.ports = ports;
    return this;
  }

  /**
   * publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet&#39;s Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered &#34;ready&#34; even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.
   */
  public ServiceSpec publishNotReadyAddresses(Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
    return this;
  }

  /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
   */
  public ServiceSpec selector(Selector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Supports &#34;ClientIP&#34; and &#34;None&#34;. Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   */
  public ServiceSpec sessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return this;
  }

  public ServiceSpec sessionAffinityConfig(SessionAffinityConfig sessionAffinityConfig) {
    this.sessionAffinityConfig = sessionAffinityConfig;
    return this;
  }

  /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. &#34;ClusterIP&#34; allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is &#34;None&#34;, no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. &#34;NodePort&#34; builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. &#34;LoadBalancer&#34; builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. &#34;ExternalName&#34; aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
   */
  public ServiceSpec type(String type) {
    this.type = type;
    return this;
  }

  public static ServiceSpec serviceSpec() {
    return new ServiceSpec();
  }
}
