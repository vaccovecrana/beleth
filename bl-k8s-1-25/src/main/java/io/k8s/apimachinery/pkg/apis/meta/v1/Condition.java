package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.Long;
import java.lang.String;

/**
 * Condition contains details for one aspect of the current state of this API Resource.
 */
public class Condition {
  public String lastTransitionTime;

  public String message;

  public Long observedGeneration;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public Condition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * message is a human readable message indicating details about the transition. This may be an empty string.
   */
  public Condition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.
   */
  public Condition observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * reason contains a programmatic identifier indicating the reason for the condition&#39;s last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.
   */
  public Condition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * status of the condition, one of True, False, Unknown.
   */
  public Condition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * type of condition in CamelCase or in foo.example.com/CamelCase.
   */
  public Condition type(String type) {
    this.type = type;
    return this;
  }
}
