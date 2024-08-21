package io.k8s.api.resource.v1alpha3;

import io.k8s.apimachinery.pkg.runtime.RawExtension;
import java.lang.String;

/**
 * OpaqueDeviceConfiguration contains configuration parameters for a driver in a format defined by the driver vendor.
 */
public class OpaqueDeviceConfiguration {
  public String driver;

  public RawExtension parameters;

  /**
   * Driver is used to determine which kubelet plugin needs to be passed these configuration parameters.
   *
   * An admission policy provided by the driver developer could use this to decide whether it needs to validate them.
   *
   * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
   */
  public OpaqueDeviceConfiguration driver(String driver) {
    this.driver = driver;
    return this;
  }

  public OpaqueDeviceConfiguration parameters(RawExtension parameters) {
    this.parameters = parameters;
    return this;
  }

  public static OpaqueDeviceConfiguration opaqueDeviceConfiguration() {
    return new OpaqueDeviceConfiguration();
  }
}
