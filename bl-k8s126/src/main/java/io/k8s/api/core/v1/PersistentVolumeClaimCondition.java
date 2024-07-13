package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PersistentVolumeClaimCondition contails details about state of pvc
 */
public class PersistentVolumeClaimCondition {
  public String lastProbeTime;

  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public PersistentVolumeClaimCondition lastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public PersistentVolumeClaimCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * message is the human-readable message indicating details about last transition.
   */
  public PersistentVolumeClaimCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * reason is a unique, this should be a short, machine understandable string that gives the reason for condition&#39;s last transition. If it reports &#34;ResizeStarted&#34; that means the underlying persistent volume is being resized.
   */
  public PersistentVolumeClaimCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  public PersistentVolumeClaimCondition status(String status) {
    this.status = status;
    return this;
  }

  public PersistentVolumeClaimCondition type(String type) {
    this.type = type;
    return this;
  }

  public static PersistentVolumeClaimCondition persistentVolumeClaimCondition() {
    return new PersistentVolumeClaimCondition();
  }
}
