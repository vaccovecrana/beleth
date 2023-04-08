
package io.k8s.api.autoscaling.v2;



/**
 * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 * 
 */
public class HorizontalPodAutoscalerBehavior {

    /**
     * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
     * 
     */
    public HPAScalingRules scaleDown;
    /**
     * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
     * 
     */
    public HPAScalingRules scaleUp;

    public HorizontalPodAutoscalerBehavior withScaleDown(HPAScalingRules scaleDown) {
        this.scaleDown = scaleDown;
        return this;
    }

    public HorizontalPodAutoscalerBehavior withScaleUp(HPAScalingRules scaleUp) {
        this.scaleUp = scaleUp;
        return this;
    }

}
