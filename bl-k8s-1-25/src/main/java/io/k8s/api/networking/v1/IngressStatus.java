
package io.k8s.api.networking.v1;

import io.k8s.api.core.v1.LoadBalancerStatus;


/**
 * IngressStatus describe the current state of the Ingress.
 * 
 */
public class IngressStatus {

    /**
     * LoadBalancerStatus represents the status of a load-balancer.
     * 
     */
    public LoadBalancerStatus loadBalancer;

    public IngressStatus withLoadBalancer(LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

}
