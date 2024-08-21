package io.k8s.api.resource.v1alpha3;

import java.lang.String;
import java.util.List;

/**
 * DeviceClaimConfiguration is used for configuration parameters in DeviceClaim.
 */
public class DeviceClaimConfiguration {
  public OpaqueDeviceConfiguration opaque;

  public List<String> requests;

  public DeviceClaimConfiguration opaque(OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
    return this;
  }

  /**
   * Requests lists the names of requests where the configuration applies. If empty, it applies to all requests.
   */
  public DeviceClaimConfiguration requests(List<String> requests) {
    this.requests = requests;
    return this;
  }

  public static DeviceClaimConfiguration deviceClaimConfiguration() {
    return new DeviceClaimConfiguration();
  }
}
