package io.k8s.api.resource.v1alpha3;

import java.lang.String;

/**
 * ResourceClaimConsumerReference contains enough information to let you locate the consumer of a ResourceClaim. The user must be a resource in the same namespace as the ResourceClaim.
 */
public class ResourceClaimConsumerReference {
  public String apiGroup;

  public String name;

  public String resource;

  public String uid;

  /**
   * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
   */
  public ResourceClaimConsumerReference apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * Name is the name of resource being referenced.
   */
  public ResourceClaimConsumerReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Resource is the type of resource being referenced, for example &#34;pods&#34;.
   */
  public ResourceClaimConsumerReference resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * UID identifies exactly one incarnation of the resource.
   */
  public ResourceClaimConsumerReference uid(String uid) {
    this.uid = uid;
    return this;
  }

  public static ResourceClaimConsumerReference resourceClaimConsumerReference() {
    return new ResourceClaimConsumerReference();
  }
}
