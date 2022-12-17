
package io.k8s.api.core.v1;

import java.util.List;


/**
 * ReplicationControllerStatus represents the current status of a replication controller.
 * 
 */
public class ReplicationControllerStatus {

    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
     * 
     */
    public Integer availableReplicas;
    /**
     * Represents the latest available observations of a replication controller's current state.
     * 
     */
    public List<ReplicationControllerCondition> conditions;
    /**
     * The number of pods that have labels matching the labels of the pod template of the replication controller.
     * 
     */
    public Integer fullyLabeledReplicas;
    /**
     * ObservedGeneration reflects the generation of the most recently observed replication controller.
     * 
     */
    public Integer observedGeneration;
    /**
     * The number of ready replicas for this replication controller.
     * 
     */
    public Integer readyReplicas;
    /**
     * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
     * (Required)
     * 
     */
    public Integer replicas;

    public ReplicationControllerStatus withAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }

    public ReplicationControllerStatus withConditions(List<ReplicationControllerCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ReplicationControllerStatus withFullyLabeledReplicas(Integer fullyLabeledReplicas) {
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        return this;
    }

    public ReplicationControllerStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public ReplicationControllerStatus withReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public ReplicationControllerStatus withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

}
