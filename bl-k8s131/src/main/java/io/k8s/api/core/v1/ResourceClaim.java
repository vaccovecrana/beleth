package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ResourceClaim references one entry in PodSpec.ResourceClaims.
 */
public class ResourceClaim {
  public String name;

  public String request;

  /**
   * Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that resource available inside a container.
   */
  public ResourceClaim name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Request is the name chosen for a request in the referenced claim. If empty, everything from the claim is made available, otherwise only the result of this request.
   */
  public ResourceClaim request(String request) {
    this.request = request;
    return this;
  }

  public static ResourceClaim resourceClaim() {
    return new ResourceClaim();
  }
}
