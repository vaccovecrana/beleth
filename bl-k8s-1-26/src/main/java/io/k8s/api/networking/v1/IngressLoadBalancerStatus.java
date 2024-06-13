package io.k8s.api.networking.v1;

import java.util.List;

/**
 * IngressLoadBalancerStatus represents the status of a load-balancer.
 */
public class IngressLoadBalancerStatus {
  public List<IngressLoadBalancerIngress> ingress;

  /**
   * Ingress is a list containing ingress points for the load-balancer.
   */
  public IngressLoadBalancerStatus ingress(List<IngressLoadBalancerIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  public static IngressLoadBalancerStatus ingressLoadBalancerStatus() {
    return new IngressLoadBalancerStatus();
  }
}
