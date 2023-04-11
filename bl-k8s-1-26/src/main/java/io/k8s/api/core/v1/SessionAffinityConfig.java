package io.k8s.api.core.v1;

/**
 * SessionAffinityConfig represents the configurations of session affinity.
 */
public class SessionAffinityConfig {
  public ClientIPConfig clientIP;

  public SessionAffinityConfig clientIP(ClientIPConfig clientIP) {
    this.clientIP = clientIP;
    return this;
  }
}
