package io.k8s.api.resource.v1alpha3;

import java.lang.String;

/**
 * Device represents one individual hardware instance that can be selected based on its attributes. Besides the name, exactly one field must be set.
 */
public class Device {
  public BasicDevice basic;

  public String name;

  public Device basic(BasicDevice basic) {
    this.basic = basic;
    return this;
  }

  /**
   * Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
   */
  public Device name(String name) {
    this.name = name;
    return this;
  }

  public static Device device() {
    return new Device();
  }
}
