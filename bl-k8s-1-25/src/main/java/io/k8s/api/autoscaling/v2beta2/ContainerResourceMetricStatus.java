package io.k8s.api.autoscaling.v2beta2;

import java.lang.String;

/**
 * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
 */
public class ContainerResourceMetricStatus {
  public String container;

  public MetricValueStatus current;

  public String name;

  /**
   * Container is the name of the container in the pods of the scaling target
   */
  public ContainerResourceMetricStatus container(String container) {
    this.container = container;
    return this;
  }

  public ContainerResourceMetricStatus current(MetricValueStatus current) {
    this.current = current;
    return this;
  }

  /**
   * Name is the name of the resource in question.
   */
  public ContainerResourceMetricStatus name(String name) {
    this.name = name;
    return this;
  }
}
