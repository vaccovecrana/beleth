package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PodReadinessGate contains the reference to a pod condition
 */
public class PodReadinessGate {
  public String conditionType;

  /**
   * ConditionType refers to a condition in the pod&#39;s condition list with matching type.
   */
  public PodReadinessGate conditionType(String conditionType) {
    this.conditionType = conditionType;
    return this;
  }
}
