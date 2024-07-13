package io.k8s.api.core.v1;

import java.lang.String;

/**
 * SeccompProfile defines a pod/container&#39;s seccomp profile settings. Only one profile source may be set.
 */
public class SeccompProfile {
  public String localhostProfile;

  public String type;

  /**
   * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet&#39;s configured seccomp profile location. Must be set if type is &#34;Localhost&#34;. Must NOT be set for any other type.
   */
  public SeccompProfile localhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
    return this;
  }

  /**
   * type indicates which kind of seccomp profile will be applied. Valid options are:
   *
   * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
   */
  public SeccompProfile type(String type) {
    this.type = type;
    return this;
  }

  public static SeccompProfile seccompProfile() {
    return new SeccompProfile();
  }
}
