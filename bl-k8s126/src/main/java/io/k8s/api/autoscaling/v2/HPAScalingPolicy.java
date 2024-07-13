package io.k8s.api.autoscaling.v2;

import java.lang.Long;
import java.lang.String;

/**
 * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
 */
public class HPAScalingPolicy {
  public Long periodSeconds;

  public String type;

  public Long value;

  /**
   * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
   */
  public HPAScalingPolicy periodSeconds(Long periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * Type is used to specify the scaling policy.
   */
  public HPAScalingPolicy type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Value contains the amount of change which is permitted by the policy. It must be greater than zero
   */
  public HPAScalingPolicy value(Long value) {
    this.value = value;
    return this;
  }

  public static HPAScalingPolicy hPAScalingPolicy() {
    return new HPAScalingPolicy();
  }
}
