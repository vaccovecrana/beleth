package io.k8s.api.resource.v1alpha3;

import java.util.List;

/**
 * DeviceClaim defines how to request devices with a ResourceClaim.
 */
public class DeviceClaim {
  public List<DeviceClaimConfiguration> config;

  public List<DeviceConstraint> constraints;

  public List<DeviceRequest> requests;

  /**
   * This field holds configuration for multiple potential drivers which could satisfy requests in this claim. It is ignored while allocating the claim.
   */
  public DeviceClaim config(List<DeviceClaimConfiguration> config) {
    this.config = config;
    return this;
  }

  /**
   * These constraints must be satisfied by the set of devices that get allocated for the claim.
   */
  public DeviceClaim constraints(List<DeviceConstraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Requests represent individual requests for distinct devices which must all be satisfied. If empty, nothing needs to be allocated.
   */
  public DeviceClaim requests(List<DeviceRequest> requests) {
    this.requests = requests;
    return this;
  }

  public static DeviceClaim deviceClaim() {
    return new DeviceClaim();
  }
}
