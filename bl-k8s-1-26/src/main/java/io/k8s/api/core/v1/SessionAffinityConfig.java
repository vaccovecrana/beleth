
package io.k8s.api.core.v1;



/**
 * SessionAffinityConfig represents the configurations of session affinity.
 * 
 */
public class SessionAffinityConfig {

    /**
     * ClientIPConfig represents the configurations of Client IP based session affinity.
     * 
     */
    public ClientIPConfig clientIP;

    public SessionAffinityConfig withClientIP(ClientIPConfig clientIP) {
        this.clientIP = clientIP;
        return this;
    }

}
