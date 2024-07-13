package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 */
public class PodDNSConfig {
  public List<String> nameservers;

  public List<PodDNSConfigOption> options;

  public List<String> searches;

  /**
   * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
   */
  public PodDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  /**
   * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
   */
  public PodDNSConfig options(List<PodDNSConfigOption> options) {
    this.options = options;
    return this;
  }

  /**
   * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
   */
  public PodDNSConfig searches(List<String> searches) {
    this.searches = searches;
    return this;
  }

  public static PodDNSConfig podDNSConfig() {
    return new PodDNSConfig();
  }
}
