package io.k8s.api.autoscaling.v1;

import java.lang.Long;
import java.lang.String;

/**
 * current status of a horizontal pod autoscaler
 */
public class HorizontalPodAutoscalerStatus {
  public Long currentCPUUtilizationPercentage;

  public Long currentReplicas;

  public Long desiredReplicas;

  public String lastScaleTime;

  public Long observedGeneration;

  /**
   * currentCPUUtilizationPercentage is the current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
   */
  public HorizontalPodAutoscalerStatus currentCPUUtilizationPercentage(
      Long currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    return this;
  }

  /**
   * currentReplicas is the current number of replicas of pods managed by this autoscaler.
   */
  public HorizontalPodAutoscalerStatus currentReplicas(Long currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

  /**
   * desiredReplicas is the  desired number of replicas of pods managed by this autoscaler.
   */
  public HorizontalPodAutoscalerStatus desiredReplicas(Long desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public HorizontalPodAutoscalerStatus lastScaleTime(String lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return this;
  }

  /**
   * observedGeneration is the most recent generation observed by this autoscaler.
   */
  public HorizontalPodAutoscalerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  public static HorizontalPodAutoscalerStatus horizontalPodAutoscalerStatus() {
    return new HorizontalPodAutoscalerStatus();
  }
}
