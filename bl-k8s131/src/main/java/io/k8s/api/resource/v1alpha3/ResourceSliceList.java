package io.k8s.api.resource.v1alpha3;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * ResourceSliceList is a collection of ResourceSlices.
 */
public class ResourceSliceList {
  public String apiVersion;

  public List<ResourceSlice> items;

  public String kind;

  public ListMeta listMeta;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ResourceSliceList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Items is the list of resource ResourceSlices.
   */
  public ResourceSliceList items(List<ResourceSlice> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ResourceSliceList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ResourceSliceList listMeta(ListMeta listMeta) {
    this.listMeta = listMeta;
    return this;
  }

  public static ResourceSliceList resourceSliceList() {
    return new ResourceSliceList();
  }
}
