
package io.k8s.api.flowcontrol.v1beta2;



/**
 * PriorityLevelConfigurationCondition defines the condition of priority level.
 * 
 */
public class PriorityLevelConfigurationCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastTransitionTime;
    /**
     * `message` is a human-readable message indicating details about last transition.
     * 
     */
    public String message;
    /**
     * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    public String reason;
    /**
     * `status` is the status of the condition. Can be True, False, Unknown. Required.
     * 
     */
    public String status;
    /**
     * `type` is the type of the condition. Required.
     * 
     */
    public String type;

    public PriorityLevelConfigurationCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public PriorityLevelConfigurationCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public PriorityLevelConfigurationCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public PriorityLevelConfigurationCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public PriorityLevelConfigurationCondition withType(String type) {
        this.type = type;
        return this;
    }

}
