
package io.k8s.api.apps.v1;

import java.util.List;


/**
 * DeploymentStatus is the most recently observed status of the Deployment.
 * 
 */
public class DeploymentStatus {

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
     * 
     */
    public Integer availableReplicas;
    /**
     * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
     * 
     */
    public Integer collisionCount;
    /**
     * Represents the latest available observations of a deployment's current state.
     * 
     */
    public List<DeploymentCondition> conditions;
    /**
     * The generation observed by the deployment controller.
     * 
     */
    public Integer observedGeneration;
    /**
     * readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.
     * 
     */
    public Integer readyReplicas;
    /**
     * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     * 
     */
    public Integer replicas;
    /**
     * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
     * 
     */
    public Integer unavailableReplicas;
    /**
     * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     * 
     */
    public Integer updatedReplicas;

    public DeploymentStatus withAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }

    public DeploymentStatus withCollisionCount(Integer collisionCount) {
        this.collisionCount = collisionCount;
        return this;
    }

    public DeploymentStatus withConditions(List<DeploymentCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public DeploymentStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public DeploymentStatus withReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public DeploymentStatus withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public DeploymentStatus withUnavailableReplicas(Integer unavailableReplicas) {
        this.unavailableReplicas = unavailableReplicas;
        return this;
    }

    public DeploymentStatus withUpdatedReplicas(Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
        return this;
    }

}
