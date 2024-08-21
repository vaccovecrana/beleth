package io.k8s.api.apps.v1;

import java.lang.String;

/**
 * ReplicaSetCondition describes the state of a replica set at a certain point.
 */
public class ReplicaSetCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public ReplicaSetCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   */
  public ReplicaSetCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason for the condition&#39;s last transition.
   */
  public ReplicaSetCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public ReplicaSetCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of replica set condition.
   */
  public ReplicaSetCondition type(String type) {
    this.type = type;
    return this;
  }

  public static ReplicaSetCondition replicaSetCondition() {
    return new ReplicaSetCondition();
  }
}
