
package io.k8s.api.batch.v1;



/**
 * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.
 * 
 */
public class PodFailurePolicyOnPodConditionsPattern {

    /**
     * Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
     * (Required)
     * 
     */
    public String status;
    /**
     * Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.
     * (Required)
     * 
     */
    public String type;

    public PodFailurePolicyOnPodConditionsPattern withStatus(String status) {
        this.status = status;
        return this;
    }

    public PodFailurePolicyOnPodConditionsPattern withType(String type) {
        this.type = type;
        return this;
    }

}
