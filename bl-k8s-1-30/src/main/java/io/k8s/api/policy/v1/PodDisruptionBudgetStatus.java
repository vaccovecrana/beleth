package io.k8s.api.policy.v1;

import io.k8s.api.policy.v1.poddisruptionbudgetstatus.DisruptedPods;
import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;
import java.lang.Long;
import java.util.List;

/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 */
public class PodDisruptionBudgetStatus {
  public List<Condition> conditions;

  public Long currentHealthy;

  public Long desiredHealthy;

  public DisruptedPods disruptedPods;

  public Long disruptionsAllowed;

  public Long expectedPods;

  public Long observedGeneration;

  /**
   * Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller encountered an error and wasn&#39;t able to compute
   *               the number of allowed disruptions. Therefore no disruptions are
   *               allowed and the status of the condition will be False.
   * - InsufficientPods: The number of pods are either at or below the number
   *                     required by the PodDisruptionBudget. No disruptions are
   *                     allowed and the status of the condition will be False.
   * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
   *                   The condition will be True, and the number of allowed
   *                   disruptions are provided by the disruptionsAllowed property.
   */
  public PodDisruptionBudgetStatus conditions(List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * current number of healthy pods
   */
  public PodDisruptionBudgetStatus currentHealthy(Long currentHealthy) {
    this.currentHealthy = currentHealthy;
    return this;
  }

  /**
   * minimum desired number of healthy pods
   */
  public PodDisruptionBudgetStatus desiredHealthy(Long desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
    return this;
  }

  /**
   * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
   */
  public PodDisruptionBudgetStatus disruptedPods(DisruptedPods disruptedPods) {
    this.disruptedPods = disruptedPods;
    return this;
  }

  /**
   * Number of pod disruptions that are currently allowed.
   */
  public PodDisruptionBudgetStatus disruptionsAllowed(Long disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
    return this;
  }

  /**
   * total number of pods counted by this disruption budget
   */
  public PodDisruptionBudgetStatus expectedPods(Long expectedPods) {
    this.expectedPods = expectedPods;
    return this;
  }

  /**
   * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB&#39;s object generation.
   */
  public PodDisruptionBudgetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }
}
