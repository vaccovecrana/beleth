package io.k8s.api.resource.v1alpha2;

import java.util.List;

/**
 * NamedResourcesResources is used in ResourceModel.
 */
public class NamedResourcesResources {
  public List<NamedResourcesInstance> instances;

  /**
   * The list of all individual resources instances currently available.
   */
  public NamedResourcesResources instances(List<NamedResourcesInstance> instances) {
    this.instances = instances;
    return this;
  }
}
