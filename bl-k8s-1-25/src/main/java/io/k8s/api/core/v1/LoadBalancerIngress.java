package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 */
public class LoadBalancerIngress {
  public String hostname;

  public String ip;

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
   * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
   */
  public LoadBalancerIngress ports(List<PortStatus> ports) {
    this.ports = ports;
    return this;
  }
}
