package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ReplicationControllerCondition describes the state of a replication controller at a certain point.
 */
public class ReplicationControllerCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public ReplicationControllerCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   */
  public ReplicationControllerCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason for the condition&#39;s last transition.
   */
  public ReplicationControllerCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public ReplicationControllerCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of replication controller condition.
   */
  public ReplicationControllerCondition type(String type) {
    this.type = type;
    return this;
  }

  public static ReplicationControllerCondition replicationControllerCondition() {
    return new ReplicationControllerCondition();
  }
}
