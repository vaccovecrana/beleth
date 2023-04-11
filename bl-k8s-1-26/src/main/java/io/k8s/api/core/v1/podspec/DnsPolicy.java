package io.k8s.api.core.v1.podspec;

/**
 * Set DNS policy for the pod. Defaults to &#34;ClusterFirst&#34;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;.
 *
 * Possible enum values:
 *  - `&#34;ClusterFirst&#34;` indicates that the pod should use cluster DNS first unless hostNetwork is true, if it is available, then fall back on the default (as determined by kubelet) DNS settings.
 *  - `&#34;ClusterFirstWithHostNet&#34;` indicates that the pod should use cluster DNS first, if it is available, then fall back on the default (as determined by kubelet) DNS settings.
 *  - `&#34;Default&#34;` indicates that the pod should use the default (as determined by kubelet) DNS settings.
 *  - `&#34;None&#34;` indicates that the pod should use empty DNS settings. DNS parameters such as nameservers and search paths should be defined via DNSConfig.
 */
public enum DnsPolicy {
  ClusterFirst,

  ClusterFirstWithHostNet,

  Default,

  None
}
