package io.k8s.api.apps.v1;

import java.lang.String;

/**
 * StatefulSetCondition describes the state of a statefulset at a certain point.
 */
public class StatefulSetCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public StatefulSetCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   */
  public StatefulSetCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason for the condition&#39;s last transition.
   */
  public StatefulSetCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public StatefulSetCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of statefulset condition.
   */
  public StatefulSetCondition type(String type) {
    this.type = type;
    return this;
  }
}
