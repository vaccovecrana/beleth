package io.k8s.api.resource.v1alpha1;

import io.k8s.api.core.v1.NodeSelector;
import java.lang.Boolean;
import java.lang.String;

/**
 * AllocationResult contains attributed of an allocated resource.
 */
public class AllocationResult {
  public NodeSelector availableOnNodes;

  public String resourceHandle;

  public Boolean shareable;

  public AllocationResult availableOnNodes(NodeSelector availableOnNodes) {
    this.availableOnNodes = availableOnNodes;
    return this;
  }

  /**
   * ResourceHandle contains arbitrary data returned by the driver after a successful allocation. This is opaque for Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
   *
   * The maximum size of this field is 16KiB. This may get increased in the future, but not reduced.
   */
  public AllocationResult resourceHandle(String resourceHandle) {
    this.resourceHandle = resourceHandle;
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
