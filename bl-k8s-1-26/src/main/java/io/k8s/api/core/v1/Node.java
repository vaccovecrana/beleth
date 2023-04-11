package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Node is a worker node in Kubernetes. Each node will have a unique identifier in the cache (i.e. in etcd).
 */
public class Node {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public NodeSpec spec;

  public NodeStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Node apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Node kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Node metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Node spec(NodeSpec spec) {
    this.spec = spec;
    return this;
  }

  public Node status(NodeStatus status) {
    this.status = status;
    return this;
  }
}
