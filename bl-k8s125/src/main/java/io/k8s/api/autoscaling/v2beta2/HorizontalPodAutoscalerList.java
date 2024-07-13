package io.k8s.api.autoscaling.v2beta2;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
 */
public class HorizontalPodAutoscalerList {
  public String apiVersion;

  public List<HorizontalPodAutoscaler> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public HorizontalPodAutoscalerList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * items is the list of horizontal pod autoscaler objects.
   */
  public HorizontalPodAutoscalerList items(List<HorizontalPodAutoscaler> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public HorizontalPodAutoscalerList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public HorizontalPodAutoscalerList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static HorizontalPodAutoscalerList horizontalPodAutoscalerList() {
    return new HorizontalPodAutoscalerList();
  }
}
