package io.k8s.api.core.v1.namespacestatus;

/**
 * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
 *
 * Possible enum values:
 *  - `&#34;Active&#34;` means the namespace is available for use in the system
 *  - `&#34;Terminating&#34;` means the namespace is undergoing graceful termination
 */
public enum Phase {
  Active,

  Terminating
}
