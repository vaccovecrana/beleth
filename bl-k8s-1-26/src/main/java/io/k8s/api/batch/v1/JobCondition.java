
package io.k8s.api.batch.v1;



/**
 * JobCondition describes current state of a job.
 * 
 */
public class JobCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastProbeTime;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastTransitionTime;
    /**
     * Human readable message indicating details about last transition.
     * 
     */
    public String message;
    /**
     * (brief) reason for the condition's last transition.
     * 
     */
    public String reason;
    /**
     * Status of the condition, one of True, False, Unknown.
     * (Required)
     * 
     */
    public String status;
    /**
     * Type of job condition, Complete or Failed.
     * (Required)
     * 
     */
    public String type;

    public JobCondition withLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    public JobCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public JobCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public JobCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public JobCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public JobCondition withType(String type) {
        this.type = type;
        return this;
    }

}
