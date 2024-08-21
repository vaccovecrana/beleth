package io.k8s.api.resource.v1alpha3;

import io.k8s.api.core.v1.NodeSelector;
import java.util.List;

/**
 * DeviceClassSpec is used in a [DeviceClass] to define what can be allocated and how to configure it.
 */
public class DeviceClassSpec {
  public List<DeviceClassConfiguration> config;

  public List<DeviceSelector> selectors;

  public NodeSelector suitableNodes;

  /**
   * Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.
   *
   * They are passed to the driver, but are not considered while allocating the claim.
   */
  public DeviceClassSpec config(List<DeviceClassConfiguration> config) {
    this.config = config;
    return this;
  }

  /**
   * Each selector must be satisfied by a device which is claimed via this class.
   */
  public DeviceClassSpec selectors(List<DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public DeviceClassSpec suitableNodes(NodeSelector suitableNodes) {
    this.suitableNodes = suitableNodes;
    return this;
  }

  public static DeviceClassSpec deviceClassSpec() {
    return new DeviceClassSpec();
  }
}
