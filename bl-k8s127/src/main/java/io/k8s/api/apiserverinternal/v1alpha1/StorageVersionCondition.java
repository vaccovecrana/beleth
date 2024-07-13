package io.k8s.api.apiserverinternal.v1alpha1;

import java.lang.Long;
import java.lang.String;

/**
 * Describes the state of the storageVersion at a certain point.
 */
public class StorageVersionCondition {
  public String lastTransitionTime;

  public String message;

  public Long observedGeneration;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public StorageVersionCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   */
  public StorageVersionCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * If set, this represents the .metadata.generation that the condition was set based upon.
   */
  public StorageVersionCondition observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The reason for the condition&#39;s last transition.
   */
  public StorageVersionCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public StorageVersionCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of the condition.
   */
  public StorageVersionCondition type(String type) {
    this.type = type;
    return this;
  }

  public static StorageVersionCondition storageVersionCondition() {
    return new StorageVersionCondition();
  }
}
