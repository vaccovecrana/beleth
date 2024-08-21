package io.k8s.api.apps.v1;

import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * StatefulSetStatus represents the current state of a StatefulSet.
 */
public class StatefulSetStatus {
  public Long availableReplicas;

  public Long collisionCount;

  public List<StatefulSetCondition> conditions;

  public Long currentReplicas;

  public String currentRevision;

  public Long observedGeneration;

  public Long readyReplicas;

  public Long replicas;

  public String updateRevision;

  public Long updatedReplicas;

  /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset.
   */
  public StatefulSetStatus availableReplicas(Long availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   */
  public StatefulSetStatus collisionCount(Long collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

  /**
   * Represents the latest available observations of a statefulset&#39;s current state.
   */
  public StatefulSetStatus conditions(List<StatefulSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
   */
  public StatefulSetStatus currentReplicas(Long currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

  /**
   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
   */
  public StatefulSetStatus currentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
    return this;
  }

  /**
   * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
   */
  public StatefulSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
   */
  public StatefulSetStatus readyReplicas(Long readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * replicas is the number of Pods created by the StatefulSet controller.
   */
  public StatefulSetStatus replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
   */
  public StatefulSetStatus updateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
    return this;
  }

  /**
   * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
   */
  public StatefulSetStatus updatedReplicas(Long updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }

  public static StatefulSetStatus statefulSetStatus() {
    return new StatefulSetStatus();
  }
}
