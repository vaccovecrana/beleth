
package io.k8s.api.core.v1;



/**
 * NodeCondition contains condition information for a node.
 * 
 */
public class NodeCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastHeartbeatTime;
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
     * Type of node condition.
     * (Required)
     * 
     */
    public String type;

    public NodeCondition withLastHeartbeatTime(String lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
        return this;
    }

    public NodeCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public NodeCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public NodeCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public NodeCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public NodeCondition withType(String type) {
        this.type = type;
        return this;
    }

}
