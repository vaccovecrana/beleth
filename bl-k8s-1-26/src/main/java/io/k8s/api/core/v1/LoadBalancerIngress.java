
package io.k8s.api.core.v1;

import java.util.List;


/**
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 * 
 */
public class LoadBalancerIngress {

    /**
     * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
     * 
     */
    public String hostname;
    /**
     * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
     * 
     */
    public String ip;
    /**
     * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
     * 
     */
    public List<PortStatus> ports;

    public LoadBalancerIngress withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public LoadBalancerIngress withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public LoadBalancerIngress withPorts(List<PortStatus> ports) {
        this.ports = ports;
        return this;
    }

}
