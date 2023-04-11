package io.k8s.api.networking.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * ClusterCIDRList contains a list of ClusterCIDR.
 */
public class ClusterCIDRList {
  public String apiVersion;

  public List<ClusterCIDR> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ClusterCIDRList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Items is the list of ClusterCIDRs.
   */
  public ClusterCIDRList items(List<ClusterCIDR> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ClusterCIDRList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ClusterCIDRList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }
}
