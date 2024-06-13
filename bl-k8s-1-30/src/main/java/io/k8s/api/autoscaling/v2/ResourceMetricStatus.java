package io.k8s.api.autoscaling.v2;

import java.lang.String;

/**
 * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
 */
public class ResourceMetricStatus {
  public MetricValueStatus current;

  public String name;

  public ResourceMetricStatus current(MetricValueStatus current) {
    this.current = current;
    return this;
  }

  /**
   * name is the name of the resource in question.
   */
  public ResourceMetricStatus name(String name) {
    this.name = name;
    return this;
  }

  public static ResourceMetricStatus resourceMetricStatus() {
    return new ResourceMetricStatus();
  }
}
