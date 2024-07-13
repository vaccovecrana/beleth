package io.k8s.api.autoscaling.v2;

/**
 * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 */
public class ExternalMetricStatus {
  public MetricValueStatus current;

  public MetricIdentifier metric;

  public ExternalMetricStatus current(MetricValueStatus current) {
    this.current = current;
    return this;
  }

  public ExternalMetricStatus metric(MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

  public static ExternalMetricStatus externalMetricStatus() {
    return new ExternalMetricStatus();
  }
}
