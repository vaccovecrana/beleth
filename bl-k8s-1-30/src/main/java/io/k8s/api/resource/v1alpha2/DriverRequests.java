package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.runtime.RawExtension;
import java.lang.String;
import java.util.List;

/**
 * DriverRequests describes all resources that are needed from one particular driver.
 */
public class DriverRequests {
  public String driverName;

  public List<ResourceRequest> requests;

  public RawExtension vendorParameters;

  /**
   * DriverName is the name used by the DRA driver kubelet plugin.
   */
  public DriverRequests driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * Requests describes all resources that are needed from the driver.
   */
  public DriverRequests requests(List<ResourceRequest> requests) {
    this.requests = requests;
    return this;
  }

  public DriverRequests vendorParameters(RawExtension vendorParameters) {
    this.vendorParameters = vendorParameters;
    return this;
  }
}
