package io.k8s.api.networking.v1;

import java.lang.String;
import java.util.List;

/**
 * IngressLoadBalancerIngress represents the status of a load-balancer ingress point.
 */
public class IngressLoadBalancerIngress {
  public String hostname;

  public String ip;

  public List<IngressPortStatus> ports;

  /**
   * hostname is set for load-balancer ingress points that are DNS based.
   */
  public IngressLoadBalancerIngress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * ip is set for load-balancer ingress points that are IP based.
   */
  public IngressLoadBalancerIngress ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * ports provides information about the ports exposed by this LoadBalancer.
   */
  public IngressLoadBalancerIngress ports(List<IngressPortStatus> ports) {
    this.ports = ports;
    return this;
  }

  public static IngressLoadBalancerIngress ingressLoadBalancerIngress() {
    return new IngressLoadBalancerIngress();
  }
}
