package io.k8s.api.autoscaling.v2beta2;

/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 */
public class PodsMetricSource {
  public MetricIdentifier metric;

  public MetricTarget target;

  public PodsMetricSource metric(MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

  public PodsMetricSource target(MetricTarget target) {
    this.target = target;
    return this;
  }

  public static PodsMetricSource podsMetricSource() {
    return new PodsMetricSource();
  }
}
