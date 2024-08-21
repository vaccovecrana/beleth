package io.k8s.api.resource.v1alpha3;

import java.lang.String;

/**
 * ResourceClaimSpec defines what is being requested in a ResourceClaim and how to configure it.
 */
public class ResourceClaimSpec {
  public String controller;

  public DeviceClaim devices;

  /**
   * Controller is the name of the DRA driver that is meant to handle allocation of this claim. If empty, allocation is handled by the scheduler while scheduling a pod.
   *
   * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
   *
   * This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
   */
  public ResourceClaimSpec controller(String controller) {
    this.controller = controller;
    return this;
  }

  public ResourceClaimSpec devices(DeviceClaim devices) {
    this.devices = devices;
    return this;
  }

  public static ResourceClaimSpec resourceClaimSpec() {
    return new ResourceClaimSpec();
  }
}
