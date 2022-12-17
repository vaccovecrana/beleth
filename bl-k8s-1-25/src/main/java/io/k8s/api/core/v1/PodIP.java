
package io.k8s.api.core.v1;



/**
 * IP address information for entries in the (plural) PodIPs field. Each entry includes:
 * 
 * 	IP: An IP address allocated to the pod. Routable at least within the cluster.
 * 
 */
public class PodIP {

    /**
     * ip is an IP address (IPv4 or IPv6) assigned to the pod
     * 
     */
    public String ip;

    public PodIP withIp(String ip) {
        this.ip = ip;
        return this;
    }

}
