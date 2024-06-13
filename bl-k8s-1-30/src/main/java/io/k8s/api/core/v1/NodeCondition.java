package io.k8s.api.core.v1;

import java.lang.String;

/**
 * NodeCondition contains condition information for a node.
 */
public class NodeCondition {
  public String lastHeartbeatTime;

  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public NodeCondition lastHeartbeatTime(String lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public NodeCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Human readable message indicating details about last transition.
   */
  public NodeCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * (brief) reason for the condition&#39;s last transition.
   */
  public NodeCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public NodeCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of node condition.
   */
  public NodeCondition type(String type) {
    this.type = type;
    return this;
  }
}
