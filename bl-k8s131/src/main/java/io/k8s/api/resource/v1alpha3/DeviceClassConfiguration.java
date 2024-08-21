package io.k8s.api.resource.v1alpha3;

/**
 * DeviceClassConfiguration is used in DeviceClass.
 */
public class DeviceClassConfiguration {
  public OpaqueDeviceConfiguration opaque;

  public DeviceClassConfiguration opaque(OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
    return this;
  }

  public static DeviceClassConfiguration deviceClassConfiguration() {
    return new DeviceClassConfiguration();
  }
}
