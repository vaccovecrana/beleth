package io.k8s.api.resource.v1alpha3;

import io.k8s.api.core.v1.NodeSelector;
import java.lang.String;

/**
 * AllocationResult contains attributes of an allocated resource.
 */
public class AllocationResult {
  public String controller;

  public DeviceAllocationResult devices;

  public NodeSelector nodeSelector;

  /**
   * Controller is the name of the DRA driver which handled the allocation. That driver is also responsible for deallocating the claim. It is empty when the claim can be deallocated without involving a driver.
   *
   * A driver may allocate devices provided by other drivers, so this driver name here can be different from the driver names listed for the results.
   *
   * This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
   */
  public AllocationResult controller(String controller) {
    this.controller = controller;
    return this;
  }

  public AllocationResult devices(DeviceAllocationResult devices) {
    this.devices = devices;
    return this;
  }

  public AllocationResult nodeSelector(NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public static AllocationResult allocationResult() {
    return new AllocationResult();
  }
}
