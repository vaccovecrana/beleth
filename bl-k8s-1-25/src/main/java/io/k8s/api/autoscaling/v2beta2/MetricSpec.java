package io.k8s.api.autoscaling.v2beta2;

import java.lang.String;

/**
 * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
 */
public class MetricSpec {
  public ContainerResourceMetricSource containerResource;

  public ExternalMetricSource external;

  public ObjectMetricSource object;

  public PodsMetricSource pods;

  public ResourceMetricSource resource;

  public String type;

  public MetricSpec containerResource(ContainerResourceMetricSource containerResource) {
    this.containerResource = containerResource;
    return this;
  }

  public MetricSpec external(ExternalMetricSource external) {
    this.external = external;
    return this;
  }

  public MetricSpec object(ObjectMetricSource object) {
    this.object = object;
    return this;
  }

  public MetricSpec pods(PodsMetricSource pods) {
    this.pods = pods;
    return this;
  }

  public MetricSpec resource(ResourceMetricSource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * type is the type of metric source.  It should be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each mapping to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
   */
  public MetricSpec type(String type) {
    this.type = type;
    return this;
  }
}
