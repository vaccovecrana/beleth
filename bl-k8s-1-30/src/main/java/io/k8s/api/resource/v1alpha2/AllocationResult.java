package io.k8s.api.resource.v1alpha2;

import io.k8s.api.core.v1.NodeSelector;
import java.lang.Boolean;
import java.util.List;

/**
 * AllocationResult contains attributes of an allocated resource.
 */
public class AllocationResult {
  public NodeSelector availableOnNodes;

  public List<ResourceHandle> resourceHandles;

  public Boolean shareable;

  public AllocationResult availableOnNodes(NodeSelector availableOnNodes) {
    this.availableOnNodes = availableOnNodes;
    return this;
  }

  /**
   * ResourceHandles contain the state associated with an allocation that should be maintained throughout the lifetime of a claim. Each ResourceHandle contains data that should be passed to a specific kubelet plugin once it lands on a node. This data is returned by the driver after a successful allocation and is opaque to Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
   *
   * Setting this field is optional. It has a maximum size of 32 entries. If null (or empty), it is assumed this allocation will be processed by a single kubelet plugin with no ResourceHandle data attached. The name of the kubelet plugin invoked will match the DriverName set in the ResourceClaimStatus this AllocationResult is embedded in.
   */
  public AllocationResult resourceHandles(List<ResourceHandle> resourceHandles) {
    this.resourceHandles = resourceHandles;
    return this;
  }

  /**
   * Shareable determines whether the resource supports more than one consumer at a time.
   */
  public AllocationResult shareable(Boolean shareable) {
    this.shareable = shareable;
    return this;
  }

  public static AllocationResult allocationResult() {
    return new AllocationResult();
  }
}
