
package io.k8s.api.core.v1;



/**
 * ReplicationControllerCondition describes the state of a replication controller at a certain point.
 * 
 */
public class ReplicationControllerCondition {

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
     * Type of replication controller condition.
     * (Required)
     * 
     */
    public String type;

    public ReplicationControllerCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public ReplicationControllerCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public ReplicationControllerCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public ReplicationControllerCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public ReplicationControllerCondition withType(String type) {
        this.type = type;
        return this;
    }

}
