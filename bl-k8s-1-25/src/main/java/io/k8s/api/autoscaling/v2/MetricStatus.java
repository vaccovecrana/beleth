package io.k8s.api.autoscaling.v2;

import java.lang.String;

/**
 * MetricStatus describes the last-read state of a single metric.
 */
public class MetricStatus {
  public ContainerResourceMetricStatus containerResource;

  public ExternalMetricStatus external;

  public ObjectMetricStatus object;

  public PodsMetricStatus pods;

  public ResourceMetricStatus resource;

  public String type;

  public MetricStatus containerResource(ContainerResourceMetricStatus containerResource) {
    this.containerResource = containerResource;
    return this;
  }

  public MetricStatus external(ExternalMetricStatus external) {
    this.external = external;
    return this;
  }

  public MetricStatus object(ObjectMetricStatus object) {
    this.object = object;
    return this;
  }

  public MetricStatus pods(PodsMetricStatus pods) {
    this.pods = pods;
    return this;
  }

  public MetricStatus resource(ResourceMetricStatus resource) {
    this.resource = resource;
    return this;
  }

  /**
   * type is the type of metric source.  It will be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each corresponds to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
   */
  public MetricStatus type(String type) {
    this.type = type;
    return this;
  }
}
