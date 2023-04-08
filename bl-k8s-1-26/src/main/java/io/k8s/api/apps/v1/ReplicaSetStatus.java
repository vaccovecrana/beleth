
package io.k8s.api.apps.v1;

import java.util.List;


/**
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 * 
 */
public class ReplicaSetStatus {

    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
     */
    public Integer availableReplicas;
    /**
     * Represents the latest available observations of a replica set's current state.
     * 
     */
    public List<ReplicaSetCondition> conditions;
    /**
     * The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
     */
    public Integer fullyLabeledReplicas;
    /**
     * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
     */
    public Integer observedGeneration;
    /**
     * readyReplicas is the number of pods targeted by this ReplicaSet with a Ready Condition.
     * 
     */
    public Integer readyReplicas;
    /**
     * Replicas is the most recently observed number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * (Required)
     * 
     */
    public Integer replicas;

    public ReplicaSetStatus withAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }

    public ReplicaSetStatus withConditions(List<ReplicaSetCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ReplicaSetStatus withFullyLabeledReplicas(Integer fullyLabeledReplicas) {
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        return this;
    }

    public ReplicaSetStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public ReplicaSetStatus withReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public ReplicaSetStatus withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

}
