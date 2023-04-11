package io.k8s.api.core.v1.servicespec;

/**
 * Supports &#34;ClientIP&#34; and &#34;None&#34;. Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
 *
 * Possible enum values:
 *  - `&#34;ClientIP&#34;` is the Client IP based.
 *  - `&#34;None&#34;` - no session affinity.
 */
public enum SessionAffinity {
  ClientIP,

  None
}
