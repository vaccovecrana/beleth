package io.k8s.api.apps.v1;

import java.lang.Long;
import java.util.List;

/**
 * DeploymentStatus is the most recently observed status of the Deployment.
 */
public class DeploymentStatus {
  public Long availableReplicas;

  public Long collisionCount;

  public List<DeploymentCondition> conditions;

  public Long observedGeneration;

  public Long readyReplicas;

  public Long replicas;

  public Long unavailableReplicas;

  public Long updatedReplicas;

  /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
   */
  public DeploymentStatus availableReplicas(Long availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
   */
  public DeploymentStatus collisionCount(Long collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

  /**
   * Represents the latest available observations of a deployment&#39;s current state.
   */
  public DeploymentStatus conditions(List<DeploymentCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The generation observed by the deployment controller.
   */
  public DeploymentStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.
   */
  public DeploymentStatus readyReplicas(Long readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
   */
  public DeploymentStatus replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
   */
  public DeploymentStatus unavailableReplicas(Long unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
    return this;
  }

  /**
   * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
   */
  public DeploymentStatus updatedReplicas(Long updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }

  public static DeploymentStatus deploymentStatus() {
    return new DeploymentStatus();
  }
}
