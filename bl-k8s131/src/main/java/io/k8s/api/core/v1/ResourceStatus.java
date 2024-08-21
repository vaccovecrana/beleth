package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

public class ResourceStatus {
  public String name;

  public List<ResourceHealth> resources;

  /**
   * Name of the resource. Must be unique within the pod and match one of the resources from the pod spec.
   */
  public ResourceStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * List of unique Resources health. Each element in the list contains an unique resource ID and resource health. At a minimum, ResourceID must uniquely identify the Resource allocated to the Pod on the Node for the lifetime of a Pod. See ResourceID type for it&#39;s definition.
   */
  public ResourceStatus resources(List<ResourceHealth> resources) {
    this.resources = resources;
    return this;
  }

  public static ResourceStatus resourceStatus() {
    return new ResourceStatus();
  }
}
