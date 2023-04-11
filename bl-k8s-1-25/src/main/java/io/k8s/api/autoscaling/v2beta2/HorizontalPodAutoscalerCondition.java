package io.k8s.api.autoscaling.v2beta2;

import java.lang.String;

/**
 * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
 */
public class HorizontalPodAutoscalerCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public HorizontalPodAutoscalerCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * message is a human-readable explanation containing details about the transition
   */
  public HorizontalPodAutoscalerCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * reason is the reason for the condition&#39;s last transition.
   */
  public HorizontalPodAutoscalerCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * status is the status of the condition (True, False, Unknown)
   */
  public HorizontalPodAutoscalerCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * type describes the current condition
   */
  public HorizontalPodAutoscalerCondition type(String type) {
    this.type = type;
    return this;
  }
}
