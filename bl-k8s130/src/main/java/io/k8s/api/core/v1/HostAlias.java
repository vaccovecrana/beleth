package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod&#39;s hosts file.
 */
public class HostAlias {
  public List<String> hostnames;

  public String ip;

  /**
   * Hostnames for the above IP address.
   */
  public HostAlias hostnames(List<String> hostnames) {
    this.hostnames = hostnames;
    return this;
  }

  /**
   * IP address of the host file entry.
   */
  public HostAlias ip(String ip) {
    this.ip = ip;
    return this;
  }

  public static HostAlias hostAlias() {
    return new HostAlias();
  }
}
