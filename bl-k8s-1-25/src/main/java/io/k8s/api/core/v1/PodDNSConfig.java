
package io.k8s.api.core.v1;

import java.util.List;


/**
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 * 
 */
public class PodDNSConfig {

    /**
     * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     * 
     */
    public List<String> nameservers;
    /**
     * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     * 
     */
    public List<PodDNSConfigOption> options;
    /**
     * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     * 
     */
    public List<String> searches;

    public PodDNSConfig withNameservers(List<String> nameservers) {
        this.nameservers = nameservers;
        return this;
    }

    public PodDNSConfig withOptions(List<PodDNSConfigOption> options) {
        this.options = options;
        return this;
    }

    public PodDNSConfig withSearches(List<String> searches) {
        this.searches = searches;
        return this;
    }

}
