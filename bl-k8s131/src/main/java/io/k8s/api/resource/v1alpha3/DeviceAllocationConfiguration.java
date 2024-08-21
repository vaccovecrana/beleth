package io.k8s.api.resource.v1alpha3;

import java.lang.String;
import java.util.List;

/**
 * DeviceAllocationConfiguration gets embedded in an AllocationResult.
 */
public class DeviceAllocationConfiguration {
  public OpaqueDeviceConfiguration opaque;

  public List<String> requests;

  public String source;

  public DeviceAllocationConfiguration opaque(OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
    return this;
  }

  /**
   * Requests lists the names of requests where the configuration applies. If empty, its applies to all requests.
   */
  public DeviceAllocationConfiguration requests(List<String> requests) {
    this.requests = requests;
    return this;
  }

  /**
   * Source records whether the configuration comes from a class and thus is not something that a normal user would have been able to set or from a claim.
   */
  public DeviceAllocationConfiguration source(String source) {
    this.source = source;
    return this;
  }

  public static DeviceAllocationConfiguration deviceAllocationConfiguration() {
    return new DeviceAllocationConfiguration();
  }
}
