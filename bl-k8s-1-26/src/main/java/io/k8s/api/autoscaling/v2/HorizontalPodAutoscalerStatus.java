
package io.k8s.api.autoscaling.v2;

import java.util.List;


/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 * 
 */
public class HorizontalPodAutoscalerStatus {

    /**
     * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    public List<HorizontalPodAutoscalerCondition> conditions;
    /**
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    public List<MetricStatus> currentMetrics;
    /**
     * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    public Integer currentReplicas;
    /**
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * (Required)
     * 
     */
    public Integer desiredReplicas;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastScaleTime;
    /**
     * observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    public Integer observedGeneration;

    public HorizontalPodAutoscalerStatus withConditions(List<HorizontalPodAutoscalerCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public HorizontalPodAutoscalerStatus withCurrentMetrics(List<MetricStatus> currentMetrics) {
        this.currentMetrics = currentMetrics;
        return this;
    }

    public HorizontalPodAutoscalerStatus withCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    public HorizontalPodAutoscalerStatus withDesiredReplicas(Integer desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
        return this;
    }

    public HorizontalPodAutoscalerStatus withLastScaleTime(String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
        return this;
    }

    public HorizontalPodAutoscalerStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

}
