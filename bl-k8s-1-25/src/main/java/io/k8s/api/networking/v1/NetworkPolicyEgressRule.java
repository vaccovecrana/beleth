
package io.k8s.api.networking.v1;

import java.util.List;


/**
 * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
 * 
 */
public class NetworkPolicyEgressRule {

    /**
     * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    public List<NetworkPolicyPort> ports;
    /**
     * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
     * 
     */
    public List<NetworkPolicyPeer> to;

    public NetworkPolicyEgressRule withPorts(List<NetworkPolicyPort> ports) {
        this.ports = ports;
        return this;
    }

    public NetworkPolicyEgressRule withTo(List<NetworkPolicyPeer> to) {
        this.to = to;
        return this;
    }

}
