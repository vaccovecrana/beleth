package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import java.lang.String;

/**
 * APIServiceCondition describes the state of an APIService at a particular point
 */
public class APIServiceCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public APIServiceCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Human-readable message indicating details about last transition.
   */
  public APIServiceCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Unique, one-word, CamelCase reason for the condition&#39;s last transition.
   */
  public APIServiceCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status is the status of the condition. Can be True, False, Unknown.
   */
  public APIServiceCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type is the type of the condition.
   */
  public APIServiceCondition type(String type) {
    this.type = type;
    return this;
  }

  public static APIServiceCondition aPIServiceCondition() {
    return new APIServiceCondition();
  }
}
