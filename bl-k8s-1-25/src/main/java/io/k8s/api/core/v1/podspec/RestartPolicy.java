package io.k8s.api.core.v1.podspec;

/**
 * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
 *
 * Possible enum values:
 *  - `&#34;Always&#34;`
 *  - `&#34;Never&#34;`
 *  - `&#34;OnFailure&#34;`
 */
public enum RestartPolicy {
  Always,

  Never,

  OnFailure
}
