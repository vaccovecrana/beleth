package io.k8s.api.core.v1.servicespec;

/**
 * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. &#34;ClusterIP&#34; allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is &#34;None&#34;, no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. &#34;NodePort&#34; builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. &#34;LoadBalancer&#34; builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. &#34;ExternalName&#34; aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
 *
 * Possible enum values:
 *  - `&#34;ClusterIP&#34;` means a service will only be accessible inside the cluster, via the cluster IP.
 *  - `&#34;ExternalName&#34;` means a service consists of only a reference to an external name that kubedns or equivalent will return as a CNAME record, with no exposing or proxying of any pods involved.
 *  - `&#34;LoadBalancer&#34;` means a service will be exposed via an external load balancer (if the cloud provider supports it), in addition to &#39;NodePort&#39; type.
 *  - `&#34;NodePort&#34;` means a service will be exposed on one port of every node, in addition to &#39;ClusterIP&#39; type.
 */
public enum Type {
  ClusterIP,

  ExternalName,

  LoadBalancer,

  NodePort
}
