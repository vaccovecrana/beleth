package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PodCondition contains details for the current condition of this pod.
 */
public class PodCondition {
  public String lastProbeTime;

  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public PodCondition lastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public PodCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Human-readable message indicating details about last transition.
   */
  public PodCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Unique, one-word, CamelCase reason for the condition&#39;s last transition.
   */
  public PodCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   */
  public PodCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   */
  public PodCondition type(String type) {
    this.type = type;
    return this;
  }

  public static PodCondition podCondition() {
    return new PodCondition();
  }
}
