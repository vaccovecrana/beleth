
package io.k8s.api.autoscaling.v2;

import java.util.List;


/**
 * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 * 
 */
public class HorizontalPodAutoscalerSpec {

    /**
     * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
     * 
     */
    public HorizontalPodAutoscalerBehavior behavior;
    /**
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
     * (Required)
     * 
     */
    public Integer maxReplicas;
    /**
     * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
     * 
     */
    public List<MetricSpec> metrics;
    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
     */
    public Integer minReplicas;
    /**
     * CrossVersionObjectReference contains enough information to let you identify the referred resource.
     * (Required)
     * 
     */
    public CrossVersionObjectReference scaleTargetRef;

    public HorizontalPodAutoscalerSpec withBehavior(HorizontalPodAutoscalerBehavior behavior) {
        this.behavior = behavior;
        return this;
    }

    public HorizontalPodAutoscalerSpec withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    public HorizontalPodAutoscalerSpec withMetrics(List<MetricSpec> metrics) {
        this.metrics = metrics;
        return this;
    }

    public HorizontalPodAutoscalerSpec withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    public HorizontalPodAutoscalerSpec withScaleTargetRef(CrossVersionObjectReference scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
        return this;
    }

}
