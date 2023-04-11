package io.k8s.api.autoscaling.v2beta2;

import java.lang.Long;
import java.util.List;

/**
 * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 */
public class HorizontalPodAutoscalerSpec {
  public HorizontalPodAutoscalerBehavior behavior;

  public Long maxReplicas;

  public List<MetricSpec> metrics;

  public Long minReplicas;

  public CrossVersionObjectReference scaleTargetRef;

  public HorizontalPodAutoscalerSpec behavior(HorizontalPodAutoscalerBehavior behavior) {
    this.behavior = behavior;
    return this;
  }

  /**
   * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
   */
  public HorizontalPodAutoscalerSpec maxReplicas(Long maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

  /**
   * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
   */
  public HorizontalPodAutoscalerSpec metrics(List<MetricSpec> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
   */
  public HorizontalPodAutoscalerSpec minReplicas(Long minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

  public HorizontalPodAutoscalerSpec scaleTargetRef(CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
    return this;
  }
}
