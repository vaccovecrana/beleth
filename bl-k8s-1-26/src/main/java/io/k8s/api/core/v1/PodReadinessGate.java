
package io.k8s.api.core.v1;



/**
 * PodReadinessGate contains the reference to a pod condition
 * 
 */
public class PodReadinessGate {

    /**
     * ConditionType refers to a condition in the pod's condition list with matching type.
     * (Required)
     * 
     */
    public String conditionType;

    public PodReadinessGate withConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }

}
