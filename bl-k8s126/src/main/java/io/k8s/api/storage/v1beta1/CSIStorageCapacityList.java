package io.k8s.api.storage.v1beta1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * CSIStorageCapacityList is a collection of CSIStorageCapacity objects.
 */
public class CSIStorageCapacityList {
  public String apiVersion;

  public List<CSIStorageCapacity> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public CSIStorageCapacityList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Items is the list of CSIStorageCapacity objects.
   */
  public CSIStorageCapacityList items(List<CSIStorageCapacity> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public CSIStorageCapacityList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public CSIStorageCapacityList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static CSIStorageCapacityList cSIStorageCapacityList() {
    return new CSIStorageCapacityList();
  }
}
