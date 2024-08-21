package io.k8s.api.apps.v1;

import java.lang.String;

/**
 * DeploymentCondition describes the state of a deployment at a certain point.
 */
public class DeploymentCondition {
  public String lastTransitionTime;

  public String lastUpdateTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public DeploymentCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public DeploymentCondition lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   */
  public DeploymentCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason for the condition&#39;s last transition.
   */
  public DeploymentCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public DeploymentCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of deployment condition.
   */
  public DeploymentCondition type(String type) {
    this.type = type;
    return this;
  }

  public static DeploymentCondition deploymentCondition() {
    return new DeploymentCondition();
  }
}
