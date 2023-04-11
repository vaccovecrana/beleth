package io.k8s.api.flowcontrol.v1beta2;

import java.lang.String;

/**
 * PriorityLevelConfigurationCondition defines the condition of priority level.
 */
public class PriorityLevelConfigurationCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public PriorityLevelConfigurationCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * `message` is a human-readable message indicating details about last transition.
   */
  public PriorityLevelConfigurationCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * `reason` is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
   */
  public PriorityLevelConfigurationCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * `status` is the status of the condition. Can be True, False, Unknown. Required.
   */
  public PriorityLevelConfigurationCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * `type` is the type of the condition. Required.
   */
  public PriorityLevelConfigurationCondition type(String type) {
    this.type = type;
    return this;
  }
}
