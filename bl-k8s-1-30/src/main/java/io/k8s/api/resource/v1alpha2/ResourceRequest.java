package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.runtime.RawExtension;

/**
 * ResourceRequest is a request for resources from one particular driver.
 */
public class ResourceRequest {
  public NamedResourcesRequest namedResources;

  public RawExtension vendorParameters;

  public ResourceRequest namedResources(NamedResourcesRequest namedResources) {
    this.namedResources = namedResources;
    return this;
  }

  public ResourceRequest vendorParameters(RawExtension vendorParameters) {
    this.vendorParameters = vendorParameters;
    return this;
  }
}
