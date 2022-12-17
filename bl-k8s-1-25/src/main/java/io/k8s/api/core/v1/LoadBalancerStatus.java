
package io.k8s.api.core.v1;

import java.util.List;


/**
 * LoadBalancerStatus represents the status of a load-balancer.
 * 
 */
public class LoadBalancerStatus {

    /**
     * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
     * 
     */
    public List<LoadBalancerIngress> ingress;

    public LoadBalancerStatus withIngress(List<LoadBalancerIngress> ingress) {
        this.ingress = ingress;
        return this;
    }

}
