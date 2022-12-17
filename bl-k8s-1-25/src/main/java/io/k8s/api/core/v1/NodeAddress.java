
package io.k8s.api.core.v1;



/**
 * NodeAddress contains information for the node's address.
 * 
 */
public class NodeAddress {

    /**
     * The node address.
     * (Required)
     * 
     */
    public String address;
    /**
     * Node address type, one of Hostname, ExternalIP or InternalIP.
     * (Required)
     * 
     */
    public String type;

    public NodeAddress withAddress(String address) {
        this.address = address;
        return this;
    }

    public NodeAddress withType(String type) {
        this.type = type;
        return this;
    }

}
