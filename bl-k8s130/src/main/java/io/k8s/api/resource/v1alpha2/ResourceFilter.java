package io.k8s.api.resource.v1alpha2;

import java.lang.String;

/**
 * ResourceFilter is a filter for resources from one particular driver.
 */
public class ResourceFilter {
  public String driverName;

  public NamedResourcesFilter namedResources;

  /**
   * DriverName is the name used by the DRA driver kubelet plugin.
   */
  public ResourceFilter driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  public ResourceFilter namedResources(NamedResourcesFilter namedResources) {
    this.namedResources = namedResources;
    return this;
  }

  public static ResourceFilter resourceFilter() {
    return new ResourceFilter();
  }
}
