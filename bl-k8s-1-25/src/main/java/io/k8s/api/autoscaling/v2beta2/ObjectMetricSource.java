package io.k8s.api.autoscaling.v2beta2;

/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
public class ObjectMetricSource {
  public CrossVersionObjectReference describedObject;

  public MetricIdentifier metric;

  public MetricTarget target;

  public ObjectMetricSource describedObject(CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
    return this;
  }

  public ObjectMetricSource metric(MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

  public ObjectMetricSource target(MetricTarget target) {
    this.target = target;
    return this;
  }
}
