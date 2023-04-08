
package io.k8s.api.core.v1;



/**
 * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
 * 
 */
public class NodeDaemonEndpoints {

    /**
     * DaemonEndpoint contains information about a single Daemon endpoint.
     * 
     */
    public DaemonEndpoint kubeletEndpoint;

    public NodeDaemonEndpoints withKubeletEndpoint(DaemonEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
        return this;
    }

}
