package io.k8s.api.resource.v1alpha1;

import java.lang.String;

/**
 * ResourceClaimSpec defines how a resource is to be allocated.
 */
public class ResourceClaimSpec {
  public String allocationMode;

  public ResourceClaimParametersReference parametersRef;

  public String resourceClassName;

  /**
   * Allocation can start immediately or when a Pod wants to use the resource. &#34;WaitForFirstConsumer&#34; is the default.
   */
  public ResourceClaimSpec allocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
    return this;
  }

  public ResourceClaimSpec parametersRef(ResourceClaimParametersReference parametersRef) {
    this.parametersRef = parametersRef;
    return this;
  }

  /**
   * ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
   */
  public ResourceClaimSpec resourceClassName(String resourceClassName) {
    this.resourceClassName = resourceClassName;
    return this;
  }

  public static ResourceClaimSpec resourceClaimSpec() {
    return new ResourceClaimSpec();
  }
}
