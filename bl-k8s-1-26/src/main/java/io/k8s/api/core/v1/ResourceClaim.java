package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ResourceClaim references one entry in PodSpec.ResourceClaims.
 */
public class ResourceClaim {
  public String name;

  /**
   * Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that resource available inside a container.
   */
  public ResourceClaim name(String name) {
    this.name = name;
    return this;
  }
}
