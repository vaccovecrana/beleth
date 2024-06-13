package io.k8s.api.autoscaling.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * configuration of a horizontal pod autoscaler.
 */
public class HorizontalPodAutoscaler {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public HorizontalPodAutoscalerSpec spec;

  public HorizontalPodAutoscalerStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public HorizontalPodAutoscaler apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public HorizontalPodAutoscaler kind(String kind) {
    this.kind = kind;
    return this;
  }

  public HorizontalPodAutoscaler metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public HorizontalPodAutoscaler spec(HorizontalPodAutoscalerSpec spec) {
    this.spec = spec;
    return this;
  }

  public HorizontalPodAutoscaler status(HorizontalPodAutoscalerStatus status) {
    this.status = status;
    return this;
  }

  public static HorizontalPodAutoscaler horizontalPodAutoscaler() {
    return new HorizontalPodAutoscaler();
  }
}
