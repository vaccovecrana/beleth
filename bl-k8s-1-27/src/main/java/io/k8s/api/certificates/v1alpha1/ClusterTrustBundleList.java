package io.k8s.api.certificates.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * ClusterTrustBundleList is a collection of ClusterTrustBundle objects
 */
public class ClusterTrustBundleList {
  public String apiVersion;

  public List<ClusterTrustBundle> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ClusterTrustBundleList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * items is a collection of ClusterTrustBundle objects
   */
  public ClusterTrustBundleList items(List<ClusterTrustBundle> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ClusterTrustBundleList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ClusterTrustBundleList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static ClusterTrustBundleList clusterTrustBundleList() {
    return new ClusterTrustBundleList();
  }
}
