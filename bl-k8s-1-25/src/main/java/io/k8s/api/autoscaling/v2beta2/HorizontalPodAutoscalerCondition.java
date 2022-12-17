
package io.k8s.api.autoscaling.v2beta2;



/**
 * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
 * 
 */
public class HorizontalPodAutoscalerCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastTransitionTime;
    /**
     * message is a human-readable explanation containing details about the transition
     * 
     */
    public String message;
    /**
     * reason is the reason for the condition's last transition.
     * 
     */
    public String reason;
    /**
     * status is the status of the condition (True, False, Unknown)
     * (Required)
     * 
     */
    public String status;
    /**
     * type describes the current condition
     * (Required)
     * 
     */
    public String type;

    public HorizontalPodAutoscalerCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public HorizontalPodAutoscalerCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public HorizontalPodAutoscalerCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public HorizontalPodAutoscalerCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public HorizontalPodAutoscalerCondition withType(String type) {
        this.type = type;
        return this;
    }

}
