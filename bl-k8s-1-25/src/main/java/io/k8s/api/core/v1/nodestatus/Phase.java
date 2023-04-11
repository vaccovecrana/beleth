package io.k8s.api.core.v1.nodestatus;

/**
 * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
 *
 * Possible enum values:
 *  - `&#34;Pending&#34;` means the node has been created/added by the system, but not configured.
 *  - `&#34;Running&#34;` means the node has been configured and has Kubernetes components running.
 *  - `&#34;Terminated&#34;` means the node has been removed from the cluster.
 */
public enum Phase {
  Pending,

  Running,

  Terminated
}
