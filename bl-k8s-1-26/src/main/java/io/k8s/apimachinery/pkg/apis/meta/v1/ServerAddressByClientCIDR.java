
package io.k8s.apimachinery.pkg.apis.meta.v1;



/**
 * ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.
 * 
 */
public class ServerAddressByClientCIDR {

    /**
     * The CIDR with which clients can match their IP to figure out the server address that they should use.
     * (Required)
     * 
     */
    public String clientCIDR;
    /**
     * Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or IP:port.
     * (Required)
     * 
     */
    public String serverAddress;

    public ServerAddressByClientCIDR withClientCIDR(String clientCIDR) {
        this.clientCIDR = clientCIDR;
        return this;
    }

    public ServerAddressByClientCIDR withServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
        return this;
    }

}
