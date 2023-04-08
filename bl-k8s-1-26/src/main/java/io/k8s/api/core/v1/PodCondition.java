
package io.k8s.api.core.v1;



/**
 * PodCondition contains details for the current condition of this pod.
 * 
 */
public class PodCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastProbeTime;
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
     * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * (Required)
     * 
     */
    public String status;
    /**
     * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * (Required)
     * 
     */
    public String type;

    public PodCondition withLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    public PodCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public PodCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public PodCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public PodCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public PodCondition withType(String type) {
        this.type = type;
        return this;
    }

}
