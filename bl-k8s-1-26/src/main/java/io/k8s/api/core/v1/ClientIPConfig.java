package io.k8s.api.core.v1;

import java.lang.Long;

/**
 * ClientIPConfig represents the configurations of Client IP based session affinity.
 */
public class ClientIPConfig {
  public Long timeoutSeconds;

  /**
   * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be &#62;0 &#38;&#38; &#60;=86400(for 1 day) if ServiceAffinity == &#34;ClientIP&#34;. Default value is 10800(for 3 hours).
   */
  public ClientIPConfig timeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
}
