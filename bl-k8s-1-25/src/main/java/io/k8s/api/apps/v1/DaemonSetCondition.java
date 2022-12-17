
package io.k8s.api.apps.v1;



/**
 * DaemonSetCondition describes the state of a DaemonSet at a certain point.
 * 
 */
public class DaemonSetCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastTransitionTime;
    /**
     * A human readable message indicating details about the transition.
     * 
     */
    public String message;
    /**
     * The reason for the condition's last transition.
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
     * Type of DaemonSet condition.
     * (Required)
     * 
     */
    public String type;

    public DaemonSetCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public DaemonSetCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public DaemonSetCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public DaemonSetCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public DaemonSetCondition withType(String type) {
        this.type = type;
        return this;
    }

}
