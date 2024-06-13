package io.k8s.api.batch.v1;

import java.lang.String;

/**
 * JobCondition describes current state of a job.
 */
public class JobCondition {
  public String lastProbeTime;

  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public JobCondition lastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public JobCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Human readable message indicating details about last transition.
   */
  public JobCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * (brief) reason for the condition&#39;s last transition.
   */
  public JobCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public JobCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of job condition, Complete or Failed.
   */
  public JobCondition type(String type) {
    this.type = type;
    return this;
  }

  public static JobCondition jobCondition() {
    return new JobCondition();
  }
}
