
package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;



/**
 * APIServiceCondition describes the state of an APIService at a particular point
 * 
 */
public class APIServiceCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastTransitionTime;
    /**
     * Human-readable message indicating details about last transition.
     * 
     */
    public String message;
    /**
     * Unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    public String reason;
    /**
     * Status is the status of the condition. Can be True, False, Unknown.
     * (Required)
     * 
     */
    public String status;
    /**
     * Type is the type of the condition.
     * (Required)
     * 
     */
    public String type;

    public APIServiceCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public APIServiceCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public APIServiceCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public APIServiceCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public APIServiceCondition withType(String type) {
        this.type = type;
        return this;
    }

}
