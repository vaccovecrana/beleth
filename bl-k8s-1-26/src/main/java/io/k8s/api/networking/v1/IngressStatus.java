package io.k8s.api.networking.v1;

/**
 * IngressStatus describe the current state of the Ingress.
 */
public class IngressStatus {
  public IngressLoadBalancerStatus loadBalancer;

  public IngressStatus loadBalancer(IngressLoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }

  public static IngressStatus ingressStatus() {
    return new IngressStatus();
  }
}
