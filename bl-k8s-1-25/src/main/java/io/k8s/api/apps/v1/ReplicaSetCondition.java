
package io.k8s.api.apps.v1;



/**
 * ReplicaSetCondition describes the state of a replica set at a certain point.
 * 
 */
public class ReplicaSetCondition {

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
     * Type of replica set condition.
     * (Required)
     * 
     */
    public String type;

    public ReplicaSetCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public ReplicaSetCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public ReplicaSetCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public ReplicaSetCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public ReplicaSetCondition withType(String type) {
        this.type = type;
        return this;
    }

}
