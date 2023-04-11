package io.k8s.api.networking.v1;

import io.k8s.api.core.v1.LoadBalancerStatus;

/**
 * IngressStatus describe the current state of the Ingress.
 */
public class IngressStatus {
  public LoadBalancerStatus loadBalancer;

  public IngressStatus loadBalancer(LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }
}
