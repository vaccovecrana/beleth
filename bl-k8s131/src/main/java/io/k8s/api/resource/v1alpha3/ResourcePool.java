package io.k8s.api.resource.v1alpha3;

import java.lang.Long;
import java.lang.String;

/**
 * ResourcePool describes the pool that ResourceSlices belong to.
 */
public class ResourcePool {
  public Long generation;

  public String name;

  public Long resourceSliceCount;

  /**
   * Generation tracks the change in a pool over time. Whenever a driver changes something about one or more of the resources in a pool, it must change the generation in all ResourceSlices which are part of that pool. Consumers of ResourceSlices should only consider resources from the pool with the highest generation number. The generation may be reset by drivers, which should be fine for consumers, assuming that all ResourceSlices in a pool are updated to match or deleted.
   *
   * Combined with ResourceSliceCount, this mechanism enables consumers to detect pools which are comprised of multiple ResourceSlices and are in an incomplete state.
   */
  public ResourcePool generation(Long generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Name is used to identify the pool. For node-local devices, this is often the node name, but this is not required.
   *
   * It must not be longer than 253 characters and must consist of one or more DNS sub-domains separated by slashes. This field is immutable.
   */
  public ResourcePool name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ResourceSliceCount is the total number of ResourceSlices in the pool at this generation number. Must be greater than zero.
   *
   * Consumers can use this to check whether they have seen all ResourceSlices belonging to the same pool.
   */
  public ResourcePool resourceSliceCount(Long resourceSliceCount) {
    this.resourceSliceCount = resourceSliceCount;
    return this;
  }

  public static ResourcePool resourcePool() {
    return new ResourcePool();
  }
}
