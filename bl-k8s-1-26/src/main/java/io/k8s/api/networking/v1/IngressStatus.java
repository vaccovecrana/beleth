
package io.k8s.api.networking.v1;



/**
 * IngressStatus describe the current state of the Ingress.
 * 
 */
public class IngressStatus {

    /**
     * IngressLoadBalancerStatus represents the status of a load-balancer.
     * 
     */
    public IngressLoadBalancerStatus loadBalancer;

    public IngressStatus withLoadBalancer(IngressLoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

}
