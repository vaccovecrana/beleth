
package io.k8s.api.networking.v1;

import java.util.List;


/**
 * IngressTLS describes the transport layer security associated with an Ingress.
 * 
 */
public class IngressTLS {

    /**
     * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * 
     */
    public List<String> hosts;
    /**
     * SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     * 
     */
    public String secretName;

    public IngressTLS withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public IngressTLS withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

}
