package io.k8s.api.core.v1;

import io.k8s.api.core.v1.seccompprofile.Type;
import java.lang.String;

/**
 * SeccompProfile defines a pod/container&#39;s seccomp profile settings. Only one profile source may be set.
 */
public class SeccompProfile {
  public String localhostProfile;

  public Type type;

  /**
   * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet&#39;s configured seccomp profile location. Must only be set if type is &#34;Localhost&#34;.
   */
  public SeccompProfile localhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
    return this;
  }

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
  public SeccompProfile type(Type type) {
    this.type = type;
    return this;
  }
}
