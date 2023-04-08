
package io.k8s.api.flowcontrol.v1beta3;



/**
 * FlowSchemaCondition describes conditions for a FlowSchema.
 * 
 */
public class FlowSchemaCondition {

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

    public FlowSchemaCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public FlowSchemaCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public FlowSchemaCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public FlowSchemaCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public FlowSchemaCondition withType(String type) {
        this.type = type;
        return this;
    }

}
