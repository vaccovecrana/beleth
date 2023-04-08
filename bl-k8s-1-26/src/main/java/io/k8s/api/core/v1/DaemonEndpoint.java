
package io.k8s.api.core.v1;



/**
 * DaemonEndpoint contains information about a single Daemon endpoint.
 * 
 */
public class DaemonEndpoint {

    /**
     * Port number of the given endpoint.
     * (Required)
     * 
     */
    public Integer port;

    public DaemonEndpoint withPort(Integer port) {
        this.port = port;
        return this;
    }

}
