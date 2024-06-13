package io.k8s.api.resource.v1alpha2;

import java.lang.String;

/**
 * NamedResourcesAllocationResult is used in AllocationResultModel.
 */
public class NamedResourcesAllocationResult {
  public String name;

  /**
   * Name is the name of the selected resource instance.
   */
  public NamedResourcesAllocationResult name(String name) {
    this.name = name;
    return this;
  }

  public static NamedResourcesAllocationResult namedResourcesAllocationResult() {
    return new NamedResourcesAllocationResult();
  }
}
