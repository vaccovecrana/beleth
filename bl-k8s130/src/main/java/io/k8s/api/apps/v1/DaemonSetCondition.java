package io.k8s.api.apps.v1;

import java.lang.String;

/**
 * DaemonSetCondition describes the state of a DaemonSet at a certain point.
 */
public class DaemonSetCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public DaemonSetCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   */
  public DaemonSetCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason for the condition&#39;s last transition.
   */
  public DaemonSetCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public DaemonSetCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of DaemonSet condition.
   */
  public DaemonSetCondition type(String type) {
    this.type = type;
    return this;
  }

  public static DaemonSetCondition daemonSetCondition() {
    return new DaemonSetCondition();
  }
}
