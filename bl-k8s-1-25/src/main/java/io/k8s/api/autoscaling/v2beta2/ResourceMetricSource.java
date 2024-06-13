package io.k8s.api.autoscaling.v2beta2;

import java.lang.String;

/**
 * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.  Only one &#34;target&#34; type should be set.
 */
public class ResourceMetricSource {
  public String name;

  public MetricTarget target;

  /**
   * name is the name of the resource in question.
   */
  public ResourceMetricSource name(String name) {
    this.name = name;
    return this;
  }

  public ResourceMetricSource target(MetricTarget target) {
    this.target = target;
    return this;
  }

  public static ResourceMetricSource resourceMetricSource() {
    return new ResourceMetricSource();
  }
}
