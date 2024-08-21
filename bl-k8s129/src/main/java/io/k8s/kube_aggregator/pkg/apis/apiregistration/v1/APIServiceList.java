package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * APIServiceList is a list of APIService objects.
 */
public class APIServiceList {
  public String apiVersion;

  public List<APIService> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public APIServiceList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Items is the list of APIService
   */
  public APIServiceList items(List<APIService> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public APIServiceList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public APIServiceList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static APIServiceList aPIServiceList() {
    return new APIServiceList();
  }
}
