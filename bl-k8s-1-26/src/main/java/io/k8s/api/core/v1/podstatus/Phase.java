package io.k8s.api.core.v1.podstatus;

/**
 * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:
 *
 * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
 *
 * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
 *
 * Possible enum values:
 *  - `&#34;Failed&#34;` means that all containers in the pod have terminated, and at least one container has terminated in a failure (exited with a non-zero exit code or was stopped by the system).
 *  - `&#34;Pending&#34;` means the pod has been accepted by the system, but one or more of the containers has not been started. This includes time before being bound to a node, as well as time spent pulling images onto the host.
 *  - `&#34;Running&#34;` means the pod has been bound to a node and all of the containers have been started. At least one container is still running or is in the process of being restarted.
 *  - `&#34;Succeeded&#34;` means that all containers in the pod have voluntarily terminated with a container exit code of 0, and the system is not going to restart any of these containers.
 *  - `&#34;Unknown&#34;` means that for some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod. Deprecated: It isn&#39;t being set since 2015 (74da3b14b0c0f658b3bb8d2def5094686d0e9095)
 */
public enum Phase {
  Failed,

  Pending,

  Running,

  Succeeded,

  Unknown
}
