package io.k8s.api.networking.v1alpha1;

import io.k8s.api.core.v1.NodeSelector;
import java.lang.Long;
import java.lang.String;

/**
 * ClusterCIDRSpec defines the desired state of ClusterCIDR.
 */
public class ClusterCIDRSpec {
  public String ipv4;

  public String ipv6;

  public NodeSelector nodeSelector;

  public Long perNodeHostBits;

  /**
   * ipv4 defines an IPv4 IP block in CIDR notation(e.g. &#34;10.0.0.0/8&#34;). At least one of ipv4 and ipv6 must be specified. This field is immutable.
   */
  public ClusterCIDRSpec ipv4(String ipv4) {
    this.ipv4 = ipv4;
    return this;
  }

  /**
   * ipv6 defines an IPv6 IP block in CIDR notation(e.g. &#34;2001:db8::/64&#34;). At least one of ipv4 and ipv6 must be specified. This field is immutable.
   */
  public ClusterCIDRSpec ipv6(String ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

  public ClusterCIDRSpec nodeSelector(NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  /**
   * perNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
   */
  public ClusterCIDRSpec perNodeHostBits(Long perNodeHostBits) {
    this.perNodeHostBits = perNodeHostBits;
    return this;
  }

  public static ClusterCIDRSpec clusterCIDRSpec() {
    return new ClusterCIDRSpec();
  }
}
