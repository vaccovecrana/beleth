package io.k8s.api.core.v1;

import java.lang.Boolean;

/**
 * NodeRuntimeHandlerFeatures is a set of runtime features.
 */
public class NodeRuntimeHandlerFeatures {
  public Boolean recursiveReadOnlyMounts;

  /**
   * RecursiveReadOnlyMounts is set to true if the runtime handler supports RecursiveReadOnlyMounts.
   */
  public NodeRuntimeHandlerFeatures recursiveReadOnlyMounts(Boolean recursiveReadOnlyMounts) {
    this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    return this;
  }
}
