package io.k8s.api.resource.v1alpha2;

import java.lang.String;

/**
 * ResourceHandle holds opaque resource data for processing by a specific kubelet plugin.
 */
public class ResourceHandle {
  public String data;

  public String driverName;

  public StructuredResourceHandle structuredData;

  /**
   * Data contains the opaque data associated with this ResourceHandle. It is set by the controller component of the resource driver whose name matches the DriverName set in the ResourceClaimStatus this ResourceHandle is embedded in. It is set at allocation time and is intended for processing by the kubelet plugin whose name matches the DriverName set in this ResourceHandle.
   *
   * The maximum size of this field is 16KiB. This may get increased in the future, but not reduced.
   */
  public ResourceHandle data(String data) {
    this.data = data;
    return this;
  }

  /**
   * DriverName specifies the name of the resource driver whose kubelet plugin should be invoked to process this ResourceHandle&#39;s data once it lands on a node. This may differ from the DriverName set in ResourceClaimStatus this ResourceHandle is embedded in.
   */
  public ResourceHandle driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  public ResourceHandle structuredData(StructuredResourceHandle structuredData) {
    this.structuredData = structuredData;
    return this;
  }
}
