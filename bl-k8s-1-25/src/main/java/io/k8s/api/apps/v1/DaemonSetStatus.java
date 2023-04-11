package io.k8s.api.apps.v1;

import java.lang.Long;
import java.util.List;

/**
 * DaemonSetStatus represents the current status of a daemon set.
 */
public class DaemonSetStatus {
  public Long collisionCount;

  public List<DaemonSetCondition> conditions;

  public Long currentNumberScheduled;

  public Long desiredNumberScheduled;

  public Long numberAvailable;

  public Long numberMisscheduled;

  public Long numberReady;

  public Long numberUnavailable;

  public Long observedGeneration;

  public Long updatedNumberScheduled;

  /**
   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   */
  public DaemonSetStatus collisionCount(Long collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

  /**
   * Represents the latest available observations of a DaemonSet&#39;s current state.
   */
  public DaemonSetStatus conditions(List<DaemonSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   */
  public DaemonSetStatus currentNumberScheduled(Long currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
    return this;
  }

  /**
   * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   */
  public DaemonSetStatus desiredNumberScheduled(Long desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
    return this;
  }

  /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
   */
  public DaemonSetStatus numberAvailable(Long numberAvailable) {
    this.numberAvailable = numberAvailable;
    return this;
  }

  /**
   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   */
  public DaemonSetStatus numberMisscheduled(Long numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
    return this;
  }

  /**
   * numberReady is the number of nodes that should be running the daemon pod and have one or more of the daemon pod running with a Ready Condition.
   */
  public DaemonSetStatus numberReady(Long numberReady) {
    this.numberReady = numberReady;
    return this;
  }

  /**
   * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
   */
  public DaemonSetStatus numberUnavailable(Long numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
    return this;
  }

  /**
   * The most recent generation observed by the daemon set controller.
   */
  public DaemonSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The total number of nodes that are running updated daemon pod
   */
  public DaemonSetStatus updatedNumberScheduled(Long updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
    return this;
  }
}
