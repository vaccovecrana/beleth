package io.k8s.api.apps.v1;

import java.lang.Long;
import java.util.List;

/**
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 */
public class ReplicaSetStatus {
  public Long availableReplicas;

  public List<ReplicaSetCondition> conditions;

  public Long fullyLabeledReplicas;

  public Long observedGeneration;

  public Long readyReplicas;

  public Long replicas;

  /**
   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
   */
  public ReplicaSetStatus availableReplicas(Long availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * Represents the latest available observations of a replica set&#39;s current state.
   */
  public ReplicaSetStatus conditions(List<ReplicaSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The number of pods that have labels matching the labels of the pod template of the replicaset.
   */
  public ReplicaSetStatus fullyLabeledReplicas(Long fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

  /**
   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
   */
  public ReplicaSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * readyReplicas is the number of pods targeted by this ReplicaSet with a Ready Condition.
   */
  public ReplicaSetStatus readyReplicas(Long readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   */
  public ReplicaSetStatus replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }
}
