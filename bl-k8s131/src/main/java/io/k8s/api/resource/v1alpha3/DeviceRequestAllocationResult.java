package io.k8s.api.resource.v1alpha3;

import java.lang.String;

/**
 * DeviceRequestAllocationResult contains the allocation result for one request.
 */
public class DeviceRequestAllocationResult {
  public String device;

  public String driver;

  public String pool;

  public String request;

  /**
   * Device references one device instance via its name in the driver&#39;s resource pool. It must be a DNS label.
   */
  public DeviceRequestAllocationResult device(String device) {
    this.device = device;
    return this;
  }

  /**
   * Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.
   *
   * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
   */
  public DeviceRequestAllocationResult driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * This name together with the driver name and the device name field identify which device was allocated (`&#60;driver name&#62;/&#60;pool name&#62;/&#60;device name&#62;`).
   *
   * Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.
   */
  public DeviceRequestAllocationResult pool(String pool) {
    this.pool = pool;
    return this;
  }

  /**
   * Request is the name of the request in the claim which caused this device to be allocated. Multiple devices may have been allocated per request.
   */
  public DeviceRequestAllocationResult request(String request) {
    this.request = request;
    return this;
  }

  public static DeviceRequestAllocationResult deviceRequestAllocationResult() {
    return new DeviceRequestAllocationResult();
  }
}
