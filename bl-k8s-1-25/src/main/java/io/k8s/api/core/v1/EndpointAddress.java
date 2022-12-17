
package io.k8s.api.core.v1;



/**
 * EndpointAddress is a tuple that describes single IP address.
 * 
 */
public class EndpointAddress {

    /**
     * The Hostname of this endpoint
     * 
     */
    public String hostname;
    /**
     * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
     * (Required)
     * 
     */
    public String ip;
    /**
     * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
     * 
     */
    public String nodeName;
    /**
     * ObjectReference contains enough information to let you inspect or modify the referred object.
     * 
     */
    public ObjectReference targetRef;

    public EndpointAddress withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public EndpointAddress withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public EndpointAddress withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public EndpointAddress withTargetRef(ObjectReference targetRef) {
        this.targetRef = targetRef;
        return this;
    }

}
