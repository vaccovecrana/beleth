package io.k8s.api.core.v1;

import java.lang.Boolean;

/**
 * NodeRuntimeHandlerFeatures is a set of features implemented by the runtime handler.
 */
public class NodeRuntimeHandlerFeatures {
  public Boolean recursiveReadOnlyMounts;

  public Boolean userNamespaces;

  /**
   * RecursiveReadOnlyMounts is set to true if the runtime handler supports RecursiveReadOnlyMounts.
   */
  public NodeRuntimeHandlerFeatures recursiveReadOnlyMounts(Boolean recursiveReadOnlyMounts) {
    this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    return this;
  }

  /**
   * UserNamespaces is set to true if the runtime handler supports UserNamespaces, including for volumes.
   */
  public NodeRuntimeHandlerFeatures userNamespaces(Boolean userNamespaces) {
    this.userNamespaces = userNamespaces;
    return this;
  }

  public static NodeRuntimeHandlerFeatures nodeRuntimeHandlerFeatures() {
    return new NodeRuntimeHandlerFeatures();
  }
}
