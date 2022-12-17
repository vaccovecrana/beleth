
package io.k8s.api.apps.v1;



/**
 * DeploymentCondition describes the state of a deployment at a certain point.
 * 
 */
public class DeploymentCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastTransitionTime;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastUpdateTime;
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
     * Type of deployment condition.
     * (Required)
     * 
     */
    public String type;

    public DeploymentCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public DeploymentCondition withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public DeploymentCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public DeploymentCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public DeploymentCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public DeploymentCondition withType(String type) {
        this.type = type;
        return this;
    }

}
