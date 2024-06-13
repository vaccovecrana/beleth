package io.k8s.api.autoscaling.v1;

import java.lang.Long;
import java.lang.String;

/**
 * ScaleStatus represents the current status of a scale subresource.
 */
public class ScaleStatus {
  public Long replicas;

  public String selector;

  /**
   * actual number of observed instances of the scaled object.
   */
  public ScaleStatus replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * label query over pods that should match the replicas count. This is same as the label selector but in the string format to avoid introspection by clients. The string will be in the same format as the query-param syntax. More info about label selectors: http://kubernetes.io/docs/user-guide/labels#label-selectors
   */
  public ScaleStatus selector(String selector) {
    this.selector = selector;
    return this;
  }

  public static ScaleStatus scaleStatus() {
    return new ScaleStatus();
  }
}
