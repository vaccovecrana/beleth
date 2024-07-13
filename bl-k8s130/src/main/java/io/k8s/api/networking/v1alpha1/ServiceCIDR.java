package io.k8s.api.networking.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ServiceCIDR defines a range of IP addresses using CIDR format (e.g. 192.168.0.0/24 or 2001:db2::/64). This range is used to allocate ClusterIPs to Service objects.
 */
public class ServiceCIDR {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ServiceCIDRSpec spec;

  public ServiceCIDRStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ServiceCIDR apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ServiceCIDR kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ServiceCIDR metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ServiceCIDR spec(ServiceCIDRSpec spec) {
    this.spec = spec;
    return this;
  }

  public ServiceCIDR status(ServiceCIDRStatus status) {
    this.status = status;
    return this;
  }

  public static ServiceCIDR serviceCIDR() {
    return new ServiceCIDR();
  }
}
