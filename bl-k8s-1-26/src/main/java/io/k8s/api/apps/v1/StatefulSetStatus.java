
package io.k8s.api.apps.v1;

import java.util.List;


/**
 * StatefulSetStatus represents the current state of a StatefulSet.
 * 
 */
public class StatefulSetStatus {

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset.
     * 
     */
    public Integer availableReplicas;
    /**
     * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    public Integer collisionCount;
    /**
     * Represents the latest available observations of a statefulset's current state.
     * 
     */
    public List<StatefulSetCondition> conditions;
    /**
     * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    public Integer currentReplicas;
    /**
     * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    public String currentRevision;
    /**
     * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
     * 
     */
    public Integer observedGeneration;
    /**
     * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
     * 
     */
    public Integer readyReplicas;
    /**
     * replicas is the number of Pods created by the StatefulSet controller.
     * (Required)
     * 
     */
    public Integer replicas;
    /**
     * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    public String updateRevision;
    /**
     * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    public Integer updatedReplicas;

    public StatefulSetStatus withAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }

    public StatefulSetStatus withCollisionCount(Integer collisionCount) {
        this.collisionCount = collisionCount;
        return this;
    }

    public StatefulSetStatus withConditions(List<StatefulSetCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public StatefulSetStatus withCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    public StatefulSetStatus withCurrentRevision(String currentRevision) {
        this.currentRevision = currentRevision;
        return this;
    }

    public StatefulSetStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public StatefulSetStatus withReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public StatefulSetStatus withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public StatefulSetStatus withUpdateRevision(String updateRevision) {
        this.updateRevision = updateRevision;
        return this;
    }

    public StatefulSetStatus withUpdatedReplicas(Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
        return this;
    }

}
