package io.k8s.api.networking.v1alpha1;

import java.lang.String;
import java.util.List;

/**
 * ServiceCIDRSpec define the CIDRs the user wants to use for allocating ClusterIPs for Services.
 */
public class ServiceCIDRSpec {
  public List<String> cidrs;

  /**
   * CIDRs defines the IP blocks in CIDR notation (e.g. &#34;192.168.0.0/24&#34; or &#34;2001:db8::/64&#34;) from which to assign service cluster IPs. Max of two CIDRs is allowed, one of each IP family. This field is immutable.
   */
  public ServiceCIDRSpec cidrs(List<String> cidrs) {
    this.cidrs = cidrs;
    return this;
  }
}
