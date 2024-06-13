package io.k8s.api.networking.v1;

import java.lang.String;
import java.util.List;

/**
 * IPBlock describes a particular CIDR (Ex. &#34;192.168.1.0/24&#34;,&#34;2001:db8::/64&#34;) that is allowed to the pods matched by a NetworkPolicySpec&#39;s podSelector. The except entry describes CIDRs that should not be included within this rule.
 */
public class IPBlock {
  public String cidr;

  public List<String> except;

  /**
   * cidr is a string representing the IPBlock Valid examples are &#34;192.168.1.0/24&#34; or &#34;2001:db8::/64&#34;
   */
  public IPBlock cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

  /**
   * except is a slice of CIDRs that should not be included within an IPBlock Valid examples are &#34;192.168.1.0/24&#34; or &#34;2001:db8::/64&#34; Except values will be rejected if they are outside the cidr range
   */
  public IPBlock except(List<String> except) {
    this.except = except;
    return this;
  }
}
