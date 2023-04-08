
package io.k8s.api.core.v1;



/**
 * Information about the condition of a component.
 * 
 */
public class ComponentCondition {

    /**
     * Condition error code for a component. For example, a health check error code.
     * 
     */
    public String error;
    /**
     * Message about the condition for a component. For example, information about a health check.
     * 
     */
    public String message;
    /**
     * Status of the condition for a component. Valid values for "Healthy": "True", "False", or "Unknown".
     * (Required)
     * 
     */
    public String status;
    /**
     * Type of condition for a component. Valid value: "Healthy"
     * (Required)
     * 
     */
    public String type;

    public ComponentCondition withError(String error) {
        this.error = error;
        return this;
    }

    public ComponentCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public ComponentCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public ComponentCondition withType(String type) {
        this.type = type;
        return this;
    }

}
