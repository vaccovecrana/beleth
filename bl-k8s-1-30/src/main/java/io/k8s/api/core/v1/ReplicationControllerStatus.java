package io.k8s.api.core.v1;

import java.lang.Long;
import java.util.List;

/**
 * ReplicationControllerStatus represents the current status of a replication controller.
 */
public class ReplicationControllerStatus {
  public Long availableReplicas;

  public List<ReplicationControllerCondition> conditions;

  public Long fullyLabeledReplicas;

  public Long observedGeneration;

  public Long readyReplicas;

  public Long replicas;

  /**
   * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
   */
  public ReplicationControllerStatus availableReplicas(Long availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * Represents the latest available observations of a replication controller&#39;s current state.
   */
  public ReplicationControllerStatus conditions(List<ReplicationControllerCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The number of pods that have labels matching the labels of the pod template of the replication controller.
   */
  public ReplicationControllerStatus fullyLabeledReplicas(Long fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

  /**
   * ObservedGeneration reflects the generation of the most recently observed replication controller.
   */
  public ReplicationControllerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The number of ready replicas for this replication controller.
   */
  public ReplicationControllerStatus readyReplicas(Long readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * Replicas is the most recently observed number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
   */
  public ReplicationControllerStatus replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }
}
