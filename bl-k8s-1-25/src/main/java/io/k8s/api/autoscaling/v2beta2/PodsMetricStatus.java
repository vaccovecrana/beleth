package io.k8s.api.autoscaling.v2beta2;

/**
 * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 */
public class PodsMetricStatus {
  public MetricValueStatus current;

  public MetricIdentifier metric;

  public PodsMetricStatus current(MetricValueStatus current) {
    this.current = current;
    return this;
  }

  public PodsMetricStatus metric(MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

  public static PodsMetricStatus podsMetricStatus() {
    return new PodsMetricStatus();
  }
}
