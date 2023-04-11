package io.k8s.api.flowcontrol.v1beta1;

import java.lang.String;

/**
 * FlowSchemaCondition describes conditions for a FlowSchema.
 */
public class FlowSchemaCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public FlowSchemaCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * `message` is a human-readable message indicating details about last transition.
   */
  public FlowSchemaCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * `reason` is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
   */
  public FlowSchemaCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * `status` is the status of the condition. Can be True, False, Unknown. Required.
   */
  public FlowSchemaCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * `type` is the type of the condition. Required.
   */
  public FlowSchemaCondition type(String type) {
    this.type = type;
    return this;
  }
}
