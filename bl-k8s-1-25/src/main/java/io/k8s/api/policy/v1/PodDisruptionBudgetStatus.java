
package io.k8s.api.policy.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;


/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 * 
 */
public class PodDisruptionBudgetStatus {

    /**
     * Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * 
     */
    public List<Condition> conditions;
    /**
     * current number of healthy pods
     * (Required)
     * 
     */
    public Integer currentHealthy;
    /**
     * minimum desired number of healthy pods
     * (Required)
     * 
     */
    public Integer desiredHealthy;
    /**
     * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
     * 
     */
    public DisruptedPods disruptedPods;
    /**
     * Number of pod disruptions that are currently allowed.
     * (Required)
     * 
     */
    public Integer disruptionsAllowed;
    /**
     * total number of pods counted by this disruption budget
     * (Required)
     * 
     */
    public Integer expectedPods;
    /**
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
     * 
     */
    public Integer observedGeneration;

    public PodDisruptionBudgetStatus withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PodDisruptionBudgetStatus withCurrentHealthy(Integer currentHealthy) {
        this.currentHealthy = currentHealthy;
        return this;
    }

    public PodDisruptionBudgetStatus withDesiredHealthy(Integer desiredHealthy) {
        this.desiredHealthy = desiredHealthy;
        return this;
    }

    public PodDisruptionBudgetStatus withDisruptedPods(DisruptedPods disruptedPods) {
        this.disruptedPods = disruptedPods;
        return this;
    }

    public PodDisruptionBudgetStatus withDisruptionsAllowed(Integer disruptionsAllowed) {
        this.disruptionsAllowed = disruptionsAllowed;
        return this;
    }

    public PodDisruptionBudgetStatus withExpectedPods(Integer expectedPods) {
        this.expectedPods = expectedPods;
        return this;
    }

    public PodDisruptionBudgetStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

}
