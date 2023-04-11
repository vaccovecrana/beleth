package io.k8s.api.autoscaling.v2;

/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
 */
public class ExternalMetricSource {
  public MetricIdentifier metric;

  public MetricTarget target;

  public ExternalMetricSource metric(MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

  public ExternalMetricSource target(MetricTarget target) {
    this.target = target;
    return this;
  }
}
