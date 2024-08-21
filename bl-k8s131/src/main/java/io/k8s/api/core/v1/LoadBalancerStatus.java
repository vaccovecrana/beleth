package io.k8s.api.core.v1;

import java.util.List;

/**
 * LoadBalancerStatus represents the status of a load-balancer.
 */
public class LoadBalancerStatus {
  public List<LoadBalancerIngress> ingress;

  /**
   * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
   */
  public LoadBalancerStatus ingress(List<LoadBalancerIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  public static LoadBalancerStatus loadBalancerStatus() {
    return new LoadBalancerStatus();
  }
}
