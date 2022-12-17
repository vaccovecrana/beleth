
package io.k8s.api.core.v1;

import java.util.List;


/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
 * 
 */
public class HostAlias {

    /**
     * Hostnames for the above IP address.
     * 
     */
    public List<String> hostnames;
    /**
     * IP address of the host file entry.
     * 
     */
    public String ip;

    public HostAlias withHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }

    public HostAlias withIp(String ip) {
        this.ip = ip;
        return this;
    }

}
