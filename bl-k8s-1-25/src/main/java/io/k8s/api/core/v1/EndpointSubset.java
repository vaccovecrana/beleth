
package io.k8s.api.core.v1;

import java.util.List;
import io.k8s.api.discovery.v1.EndpointPort;


/**
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
 * 
 * 	{
 * 	  Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
 * 	  Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
 * 	}
 * 
 * The resulting set of endpoints can be viewed as:
 * 
 * 	a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
 * 	b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 * 
 */
public class EndpointSubset {

    /**
     * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
     * 
     */
    public List<EndpointAddress> addresses;
    /**
     * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
     * 
     */
    public List<EndpointAddress> notReadyAddresses;
    /**
     * Port numbers available on the related IP addresses.
     * 
     */
    public List<EndpointPort> ports;

    public EndpointSubset withAddresses(List<EndpointAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public EndpointSubset withNotReadyAddresses(List<EndpointAddress> notReadyAddresses) {
        this.notReadyAddresses = notReadyAddresses;
        return this;
    }

    public EndpointSubset withPorts(List<EndpointPort> ports) {
        this.ports = ports;
        return this;
    }

}
