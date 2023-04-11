package io.k8s.api.autoscaling.v1;

import java.lang.Long;

/**
 * specification of a horizontal pod autoscaler.
 */
public class HorizontalPodAutoscalerSpec {
  public Long maxReplicas;

  public Long minReplicas;

  public CrossVersionObjectReference scaleTargetRef;

  public Long targetCPUUtilizationPercentage;

  /**
   * maxReplicas is the upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
   */
  public HorizontalPodAutoscalerSpec maxReplicas(Long maxReplicas) {
    this.maxReplicas = maxReplicas;
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

  /**
   * targetCPUUtilizationPercentage is the target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
   */
  public HorizontalPodAutoscalerSpec targetCPUUtilizationPercentage(
      Long targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return this;
  }
}
