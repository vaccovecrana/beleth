
package io.k8s.api.core.v1;



/**
 * PersistentVolumeClaimCondition contails details about state of pvc
 * 
 */
public class PersistentVolumeClaimCondition {

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
     * message is the human-readable message indicating details about last transition.
     * 
     */
    public String message;
    /**
     * reason is a unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports "ResizeStarted" that means the underlying persistent volume is being resized.
     * 
     */
    public String reason;
    /**
     * 
     * (Required)
     * 
     */
    public String status;
    /**
     * 
     * (Required)
     * 
     */
    public String type;

    public PersistentVolumeClaimCondition withLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    public PersistentVolumeClaimCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public PersistentVolumeClaimCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public PersistentVolumeClaimCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public PersistentVolumeClaimCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public PersistentVolumeClaimCondition withType(String type) {
        this.type = type;
        return this;
    }

}
