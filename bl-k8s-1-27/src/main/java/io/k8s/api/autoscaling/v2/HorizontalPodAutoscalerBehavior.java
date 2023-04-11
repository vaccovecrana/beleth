package io.k8s.api.autoscaling.v2;

/**
 * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 */
public class HorizontalPodAutoscalerBehavior {
  public HPAScalingRules scaleDown;

  public HPAScalingRules scaleUp;

  public HorizontalPodAutoscalerBehavior scaleDown(HPAScalingRules scaleDown) {
    this.scaleDown = scaleDown;
    return this;
  }

  public HorizontalPodAutoscalerBehavior scaleUp(HPAScalingRules scaleUp) {
    this.scaleUp = scaleUp;
    return this;
  }
}
