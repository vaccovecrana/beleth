package io.k8s.api.resource.v1alpha3;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ResourceSlice represents one or more resources in a pool of similar resources, managed by a common driver. A pool may span more than one ResourceSlice, and exactly how many ResourceSlices comprise a pool is determined by the driver.
 *
 * At the moment, the only supported resources are devices with attributes and capacities. Each device in a given pool, regardless of how many ResourceSlices, must have a unique name. The ResourceSlice in which a device gets published may change over time. The unique identifier for a device is the tuple &#60;driver name&#62;, &#60;pool name&#62;, &#60;device name&#62;.
 *
 * Whenever a driver needs to update a pool, it increments the pool.Spec.Pool.Generation number and updates all ResourceSlices with that new number and new resource definitions. A consumer must only use ResourceSlices with the highest generation number and ignore all others.
 *
 * When allocating all resources in a pool matching certain criteria or when looking for the best solution among several different alternatives, a consumer should check the number of ResourceSlices in a pool (included in each ResourceSlice) to determine whether its view of a pool is complete and if not, should wait until the driver has completed updating the pool.
 *
 * For resources that are not local to a node, the node name is not set. Instead, the driver may use a node selector to specify where the devices are available.
 *
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
public class ResourceSlice {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ResourceSliceSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ResourceSlice apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ResourceSlice kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ResourceSlice metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ResourceSlice spec(ResourceSliceSpec spec) {
    this.spec = spec;
    return this;
  }

  public static ResourceSlice resourceSlice() {
    return new ResourceSlice();
  }
}
