package io.k8s.api.core.v1.servicespec;

/**
 * externalTrafficPolicy describes how nodes distribute service traffic they receive on one of the Service&#39;s &#34;externally-facing&#34; addresses (NodePorts, ExternalIPs, and LoadBalancer IPs). If set to &#34;Local&#34;, the proxy will configure the service in a way that assumes that external load balancers will take care of balancing the service traffic between nodes, and so each node will deliver traffic only to the node-local endpoints of the service, without masquerading the client source IP. (Traffic mistakenly sent to a node with no endpoints will be dropped.) The default value, &#34;Cluster&#34;, uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features). Note that traffic sent to an External IP or LoadBalancer IP from within the cluster will always get &#34;Cluster&#34; semantics, but clients sending to a NodePort from within the cluster may need to take traffic policy into account when picking a node.
 *
 * Possible enum values:
 *  - `&#34;Cluster&#34;` routes traffic to all endpoints.
 *  - `&#34;Local&#34;` preserves the source IP of the traffic by routing only to endpoints on the same node as the traffic was received on (dropping the traffic if there are no local endpoints).
 */
public enum ExternalTrafficPolicy {
  Cluster,

  Local
}
