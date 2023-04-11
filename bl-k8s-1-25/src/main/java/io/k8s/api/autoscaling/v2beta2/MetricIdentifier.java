package io.k8s.api.autoscaling.v2beta2;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.String;

/**
 * MetricIdentifier defines the name and optionally selector for a metric
 */
public class MetricIdentifier {
  public String name;

  public LabelSelector selector;

  /**
   * name is the name of the given metric
   */
  public MetricIdentifier name(String name) {
    this.name = name;
    return this;
  }

  public MetricIdentifier selector(LabelSelector selector) {
    this.selector = selector;
    return this;
  }
}
