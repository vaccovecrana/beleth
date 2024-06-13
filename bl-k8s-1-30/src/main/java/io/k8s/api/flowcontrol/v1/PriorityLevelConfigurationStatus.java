package io.k8s.api.flowcontrol.v1;

import java.util.List;

/**
 * PriorityLevelConfigurationStatus represents the current state of a &#34;request-priority&#34;.
 */
public class PriorityLevelConfigurationStatus {
  public List<PriorityLevelConfigurationCondition> conditions;

  /**
   * `conditions` is the current state of &#34;request-priority&#34;.
   */
  public PriorityLevelConfigurationStatus conditions(
      List<PriorityLevelConfigurationCondition> conditions) {
    this.conditions = conditions;
    return this;
  }
}
