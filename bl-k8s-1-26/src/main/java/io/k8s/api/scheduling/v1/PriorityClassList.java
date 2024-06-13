package io.k8s.api.scheduling.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * PriorityClassList is a collection of priority classes.
 */
public class PriorityClassList {
  public String apiVersion;

  public List<PriorityClass> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PriorityClassList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * items is the list of PriorityClasses
   */
  public PriorityClassList items(List<PriorityClass> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PriorityClassList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PriorityClassList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static PriorityClassList priorityClassList() {
    return new PriorityClassList();
  }
}
