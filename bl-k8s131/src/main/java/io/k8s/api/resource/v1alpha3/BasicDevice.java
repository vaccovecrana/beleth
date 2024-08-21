package io.k8s.api.resource.v1alpha3;

import io.k8s.api.resource.v1alpha3.basicdevice.Attributes;
import io.k8s.api.resource.v1alpha3.basicdevice.Capacity;

/**
 * BasicDevice defines one device instance.
 */
public class BasicDevice {
  public Attributes attributes;

  public Capacity capacity;

  /**
   * Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.
   *
   * The maximum number of attributes and capacities combined is 32.
   */
  public BasicDevice attributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.
   *
   * The maximum number of attributes and capacities combined is 32.
   */
  public BasicDevice capacity(Capacity capacity) {
    this.capacity = capacity;
    return this;
  }

  public static BasicDevice basicDevice() {
    return new BasicDevice();
  }
}
