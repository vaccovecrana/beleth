package io.k8s.api.core.v1;

import java.lang.Boolean;

/**
 * NodeFeatures describes the set of features implemented by the CRI implementation. The features contained in the NodeFeatures should depend only on the cri implementation independent of runtime handlers.
 */
public class NodeFeatures {
  public Boolean supplementalGroupsPolicy;

  /**
   * SupplementalGroupsPolicy is set to true if the runtime supports SupplementalGroupsPolicy and ContainerUser.
   */
  public NodeFeatures supplementalGroupsPolicy(Boolean supplementalGroupsPolicy) {
    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
    return this;
  }

  public static NodeFeatures nodeFeatures() {
    return new NodeFeatures();
  }
}
