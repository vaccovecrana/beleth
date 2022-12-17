
package io.k8s.api.apps.v1;



/**
 * StatefulSetCondition describes the state of a statefulset at a certain point.
 * 
 */
public class StatefulSetCondition {

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
     * Type of statefulset condition.
     * (Required)
     * 
     */
    public String type;

    public StatefulSetCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public StatefulSetCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public StatefulSetCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public StatefulSetCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public StatefulSetCondition withType(String type) {
        this.type = type;
        return this;
    }

}
