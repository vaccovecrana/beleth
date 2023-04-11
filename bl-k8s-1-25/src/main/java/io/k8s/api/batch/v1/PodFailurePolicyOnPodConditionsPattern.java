package io.k8s.api.batch.v1;

import java.lang.String;

/**
 * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.
 */
public class PodFailurePolicyOnPodConditionsPattern {
  public String status;

  public String type;

  /**
   * Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
   */
  public PodFailurePolicyOnPodConditionsPattern status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.
   */
  public PodFailurePolicyOnPodConditionsPattern type(String type) {
    this.type = type;
    return this;
  }
}
