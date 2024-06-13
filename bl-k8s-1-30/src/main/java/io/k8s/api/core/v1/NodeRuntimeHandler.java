package io.k8s.api.core.v1;

import java.lang.String;

/**
 * NodeRuntimeHandler is a set of runtime handler information.
 */
public class NodeRuntimeHandler {
  public NodeRuntimeHandlerFeatures features;

  public String name;

  public NodeRuntimeHandler features(NodeRuntimeHandlerFeatures features) {
    this.features = features;
    return this;
  }

  /**
   * Runtime handler name. Empty for the default runtime handler.
   */
  public NodeRuntimeHandler name(String name) {
    this.name = name;
    return this;
  }

  public static NodeRuntimeHandler nodeRuntimeHandler() {
    return new NodeRuntimeHandler();
  }
}
