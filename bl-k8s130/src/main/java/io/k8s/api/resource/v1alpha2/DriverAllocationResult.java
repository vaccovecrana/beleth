package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.runtime.RawExtension;

/**
 * DriverAllocationResult contains vendor parameters and the allocation result for one request.
 */
public class DriverAllocationResult {
  public NamedResourcesAllocationResult namedResources;

  public RawExtension vendorRequestParameters;

  public DriverAllocationResult namedResources(NamedResourcesAllocationResult namedResources) {
    this.namedResources = namedResources;
    return this;
  }

  public DriverAllocationResult vendorRequestParameters(RawExtension vendorRequestParameters) {
    this.vendorRequestParameters = vendorRequestParameters;
    return this;
  }

  public static DriverAllocationResult driverAllocationResult() {
    return new DriverAllocationResult();
  }
}
