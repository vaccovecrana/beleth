package io.k8s.api.resource.v1alpha3;

import java.util.List;

/**
 * DeviceAllocationResult is the result of allocating devices.
 */
public class DeviceAllocationResult {
  public List<DeviceAllocationConfiguration> config;

  public List<DeviceRequestAllocationResult> results;

  /**
   * This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.
   *
   * This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters.
   */
  public DeviceAllocationResult config(List<DeviceAllocationConfiguration> config) {
    this.config = config;
    return this;
  }

  /**
   * Results lists all allocated devices.
   */
  public DeviceAllocationResult results(List<DeviceRequestAllocationResult> results) {
    this.results = results;
    return this;
  }

  public static DeviceAllocationResult deviceAllocationResult() {
    return new DeviceAllocationResult();
  }
}
