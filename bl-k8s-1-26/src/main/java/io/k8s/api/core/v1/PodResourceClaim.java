package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PodResourceClaim references exactly one ResourceClaim through a ClaimSource. It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
 */
public class PodResourceClaim {
  public String name;

  public ClaimSource source;

  /**
   * Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
   */
  public PodResourceClaim name(String name) {
    this.name = name;
    return this;
  }

  public PodResourceClaim source(ClaimSource source) {
    this.source = source;
    return this;
  }

  public static PodResourceClaim podResourceClaim() {
    return new PodResourceClaim();
  }
}
