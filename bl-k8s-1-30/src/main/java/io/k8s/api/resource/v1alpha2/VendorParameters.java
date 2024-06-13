package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.runtime.RawExtension;
import java.lang.String;

/**
 * VendorParameters are opaque parameters for one particular driver.
 */
public class VendorParameters {
  public String driverName;

  public RawExtension parameters;

  /**
   * DriverName is the name used by the DRA driver kubelet plugin.
   */
  public VendorParameters driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  public VendorParameters parameters(RawExtension parameters) {
    this.parameters = parameters;
    return this;
  }

  public static VendorParameters vendorParameters() {
    return new VendorParameters();
  }
}
