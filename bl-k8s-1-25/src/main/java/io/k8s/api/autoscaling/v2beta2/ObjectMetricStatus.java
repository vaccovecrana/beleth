package io.k8s.api.autoscaling.v2beta2;

/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
public class ObjectMetricStatus {
  public MetricValueStatus current;

  public CrossVersionObjectReference describedObject;

  public MetricIdentifier metric;

  public ObjectMetricStatus current(MetricValueStatus current) {
    this.current = current;
    return this;
  }

  public ObjectMetricStatus describedObject(CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
    return this;
  }

  public ObjectMetricStatus metric(MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

  public static ObjectMetricStatus objectMetricStatus() {
    return new ObjectMetricStatus();
  }
}
