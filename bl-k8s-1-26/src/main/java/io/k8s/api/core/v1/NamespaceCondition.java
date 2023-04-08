
package io.k8s.api.core.v1;



/**
 * NamespaceCondition contains details about state of namespace.
 * 
 */
public class NamespaceCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastTransitionTime;
    public String message;
    public String reason;
    /**
     * Status of the condition, one of True, False, Unknown.
     * (Required)
     * 
     */
    public String status;
    /**
     * Type of namespace controller condition.
     * (Required)
     * 
     */
    public String type;

    public NamespaceCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public NamespaceCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public NamespaceCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public NamespaceCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public NamespaceCondition withType(String type) {
        this.type = type;
        return this;
    }

}
