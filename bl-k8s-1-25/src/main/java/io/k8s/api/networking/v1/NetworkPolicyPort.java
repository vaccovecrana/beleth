
package io.k8s.api.networking.v1;



/**
 * NetworkPolicyPort describes a port to allow traffic on
 * 
 */
public class NetworkPolicyPort {

    /**
     * If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
     * 
     */
    public Integer endPort;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * 
     */
    public String port;
    /**
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    public String protocol;

    public NetworkPolicyPort withEndPort(Integer endPort) {
        this.endPort = endPort;
        return this;
    }

    public NetworkPolicyPort withPort(String port) {
        this.port = port;
        return this;
    }

    public NetworkPolicyPort withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

}
