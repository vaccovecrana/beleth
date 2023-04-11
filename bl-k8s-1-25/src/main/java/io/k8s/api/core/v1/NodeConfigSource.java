package io.k8s.api.core.v1;

/**
 * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22
 */
public class NodeConfigSource {
  public ConfigMapNodeConfigSource configMap;

  public NodeConfigSource configMap(ConfigMapNodeConfigSource configMap) {
    this.configMap = configMap;
    return this;
  }
}
