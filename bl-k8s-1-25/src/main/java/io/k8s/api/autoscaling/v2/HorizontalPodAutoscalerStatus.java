package io.k8s.api.autoscaling.v2;

import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 */
public class HorizontalPodAutoscalerStatus {
  public List<HorizontalPodAutoscalerCondition> conditions;

  public List<MetricStatus> currentMetrics;

  public Long currentReplicas;

  public Long desiredReplicas;

  public String lastScaleTime;

  public Long observedGeneration;

  /**
   * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
   */
  public HorizontalPodAutoscalerStatus conditions(
      List<HorizontalPodAutoscalerCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * currentMetrics is the last read state of the metrics used by this autoscaler.
   */
  public HorizontalPodAutoscalerStatus currentMetrics(List<MetricStatus> currentMetrics) {
    this.currentMetrics = currentMetrics;
    return this;
  }

  /**
   * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
   */
  public HorizontalPodAutoscalerStatus currentReplicas(Long currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

  /**
   * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
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
}
