package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
 */
public class ReplicaSet {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ReplicaSetSpec spec;

  public ReplicaSetStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ReplicaSet apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ReplicaSet kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ReplicaSet metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ReplicaSet spec(ReplicaSetSpec spec) {
    this.spec = spec;
    return this;
  }

  public ReplicaSet status(ReplicaSetStatus status) {
    this.status = status;
    return this;
  }

  public static ReplicaSet replicaSet() {
    return new ReplicaSet();
  }
}
