package io.k8s.api.resource.v1alpha3;

/**
 * DeviceSelector must have exactly one field set.
 */
public class DeviceSelector {
  public CELDeviceSelector cel;

  public DeviceSelector cel(CELDeviceSelector cel) {
    this.cel = cel;
    return this;
  }

  public static DeviceSelector deviceSelector() {
    return new DeviceSelector();
  }
}
