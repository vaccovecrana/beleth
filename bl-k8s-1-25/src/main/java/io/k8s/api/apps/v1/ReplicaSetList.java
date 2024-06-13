package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * ReplicaSetList is a collection of ReplicaSets.
 */
public class ReplicaSetList {
  public String apiVersion;

  public List<ReplicaSet> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ReplicaSetList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * List of ReplicaSets. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
   */
  public ReplicaSetList items(List<ReplicaSet> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ReplicaSetList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ReplicaSetList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static ReplicaSetList replicaSetList() {
    return new ReplicaSetList();
  }
}
