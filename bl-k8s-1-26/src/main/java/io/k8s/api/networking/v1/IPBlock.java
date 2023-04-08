
package io.k8s.api.networking.v1;

import java.util.List;


/**
 * IPBlock describes a particular CIDR (Ex. "192.168.1.0/24","2001:db8::/64") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
 * 
 */
public class IPBlock {

    /**
     * CIDR is a string representing the IP Block Valid examples are "192.168.1.0/24" or "2001:db8::/64"
     * (Required)
     * 
     */
    public String cidr;
    /**
     * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.0/24" or "2001:db8::/64" Except values will be rejected if they are outside the CIDR range
     * 
     */
    public List<String> except;

    public IPBlock withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public IPBlock withExcept(List<String> except) {
        this.except = except;
        return this;
    }

}
