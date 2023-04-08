
package io.k8s.apimachinery.pkg.apis.meta.v1;



/**
 * Condition contains details for one aspect of the current state of this API Resource.
 * 
 */
public class Condition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * (Required)
     * 
     */
    public String lastTransitionTime;
    /**
     * message is a human readable message indicating details about the transition. This may be an empty string.
     * (Required)
     * 
     */
    public String message;
    /**
     * observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.
     * 
     */
    public Integer observedGeneration;
    /**
     * reason contains a programmatic identifier indicating the reason for the condition's last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.
     * (Required)
     * 
     */
    public String reason;
    /**
     * status of the condition, one of True, False, Unknown.
     * (Required)
     * 
     */
    public String status;
    /**
     * type of condition in CamelCase or in foo.example.com/CamelCase.
     * (Required)
     * 
     */
    public String type;

    public Condition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public Condition withMessage(String message) {
        this.message = message;
        return this;
    }

    public Condition withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public Condition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public Condition withStatus(String status) {
        this.status = status;
        return this;
    }

    public Condition withType(String type) {
        this.type = type;
        return this;
    }

}
