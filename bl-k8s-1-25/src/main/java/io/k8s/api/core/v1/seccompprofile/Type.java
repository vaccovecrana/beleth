package io.k8s.api.core.v1.seccompprofile;

/**
 * type indicates which kind of seccomp profile will be applied. Valid options are:
 *
 * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
 *
 * Possible enum values:
 *  - `&#34;Localhost&#34;` indicates a profile defined in a file on the node should be used. The file&#39;s location relative to &#60;kubelet-root-dir&#62;/seccomp.
 *  - `&#34;RuntimeDefault&#34;` represents the default container runtime seccomp profile.
 *  - `&#34;Unconfined&#34;` indicates no seccomp profile is applied (A.K.A. unconfined).
 */
public enum Type {
  Localhost,

  RuntimeDefault,

  Unconfined
}
