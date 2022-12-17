
package io.k8s.api.core.v1;



/**
 * TCPSocketAction describes an action based on opening a socket
 * 
 */
public class TCPSocketAction {

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    public String host;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * (Required)
     * 
     */
    public String port;

    public TCPSocketAction withHost(String host) {
        this.host = host;
        return this;
    }

    public TCPSocketAction withPort(String port) {
        this.port = port;
        return this;
    }

}
