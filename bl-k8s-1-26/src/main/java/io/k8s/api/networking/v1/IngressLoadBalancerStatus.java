
package io.k8s.api.networking.v1;

import java.util.List;


/**
 * IngressLoadBalancerStatus represents the status of a load-balancer.
 * 
 */
public class IngressLoadBalancerStatus {

    /**
     * Ingress is a list containing ingress points for the load-balancer.
     * 
     */
    public List<IngressLoadBalancerIngress> ingress;

    public IngressLoadBalancerStatus withIngress(List<IngressLoadBalancerIngress> ingress) {
        this.ingress = ingress;
        return this;
    }

}
