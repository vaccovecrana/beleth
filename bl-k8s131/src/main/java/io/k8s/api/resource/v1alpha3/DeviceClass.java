package io.k8s.api.resource.v1alpha3;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * DeviceClass is a vendor- or admin-provided resource that contains device configuration and selectors. It can be referenced in the device requests of a claim to apply these presets. Cluster scoped.
 *
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
public class DeviceClass {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public DeviceClassSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public DeviceClass apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public DeviceClass kind(String kind) {
    this.kind = kind;
    return this;
  }

  public DeviceClass metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public DeviceClass spec(DeviceClassSpec spec) {
    this.spec = spec;
    return this;
  }

  public static DeviceClass deviceClass() {
    return new DeviceClass();
  }
}
