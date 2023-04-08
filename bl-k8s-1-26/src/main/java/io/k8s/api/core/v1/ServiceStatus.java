
package io.k8s.api.core.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;


/**
 * ServiceStatus represents the current status of a service.
 * 
 */
public class ServiceStatus {

    /**
     * Current service state
     * 
     */
    public List<Condition> conditions;
    /**
     * LoadBalancerStatus represents the status of a load-balancer.
     * 
     */
    public LoadBalancerStatus loadBalancer;

    public ServiceStatus withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ServiceStatus withLoadBalancer(LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

}
