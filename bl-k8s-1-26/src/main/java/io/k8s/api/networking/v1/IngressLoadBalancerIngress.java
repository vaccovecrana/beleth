
package io.k8s.api.networking.v1;

import java.util.List;


/**
 * IngressLoadBalancerIngress represents the status of a load-balancer ingress point.
 * 
 */
public class IngressLoadBalancerIngress {

    /**
     * Hostname is set for load-balancer ingress points that are DNS based.
     * 
     */
    public String hostname;
    /**
     * IP is set for load-balancer ingress points that are IP based.
     * 
     */
    public String ip;
    /**
     * Ports provides information about the ports exposed by this LoadBalancer.
     * 
     */
    public List<IngressPortStatus> ports;

    public IngressLoadBalancerIngress withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public IngressLoadBalancerIngress withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public IngressLoadBalancerIngress withPorts(List<IngressPortStatus> ports) {
        this.ports = ports;
        return this;
    }

}
