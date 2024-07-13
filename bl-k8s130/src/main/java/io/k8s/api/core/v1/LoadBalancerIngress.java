package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 */
public class LoadBalancerIngress {
  public String hostname;

  public String ip;

  public String ipMode;

  public List<PortStatus> ports;

  /**
   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
   */
  public LoadBalancerIngress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
   */
  public LoadBalancerIngress ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * IPMode specifies how the load-balancer IP behaves, and may only be specified when the ip field is specified. Setting this to &#34;VIP&#34; indicates that traffic is delivered to the node with the destination set to the load-balancer&#39;s IP and port. Setting this to &#34;Proxy&#34; indicates that traffic is delivered to the node or pod with the destination set to the node&#39;s IP and node port or the pod&#39;s IP and port. Service implementations may use this information to adjust traffic routing.
   */
  public LoadBalancerIngress ipMode(String ipMode) {
    this.ipMode = ipMode;
    return this;
  }

  /**
   * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
   */
  public LoadBalancerIngress ports(List<PortStatus> ports) {
    this.ports = ports;
    return this;
  }

  public static LoadBalancerIngress loadBalancerIngress() {
    return new LoadBalancerIngress();
  }
}
