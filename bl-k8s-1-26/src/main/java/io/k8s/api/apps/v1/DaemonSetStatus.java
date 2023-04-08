
package io.k8s.api.apps.v1;

import java.util.List;


/**
 * DaemonSetStatus represents the current status of a daemon set.
 * 
 */
public class DaemonSetStatus {

    /**
     * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    public Integer collisionCount;
    /**
     * Represents the latest available observations of a DaemonSet's current state.
     * 
     */
    public List<DaemonSetCondition> conditions;
    /**
     * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * (Required)
     * 
     */
    public Integer currentNumberScheduled;
    /**
     * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * (Required)
     * 
     */
    public Integer desiredNumberScheduled;
    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    public Integer numberAvailable;
    /**
     * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * (Required)
     * 
     */
    public Integer numberMisscheduled;
    /**
     * numberReady is the number of nodes that should be running the daemon pod and have one or more of the daemon pod running with a Ready Condition.
     * (Required)
     * 
     */
    public Integer numberReady;
    /**
     * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    public Integer numberUnavailable;
    /**
     * The most recent generation observed by the daemon set controller.
     * 
     */
    public Integer observedGeneration;
    /**
     * The total number of nodes that are running updated daemon pod
     * 
     */
    public Integer updatedNumberScheduled;

    public DaemonSetStatus withCollisionCount(Integer collisionCount) {
        this.collisionCount = collisionCount;
        return this;
    }

    public DaemonSetStatus withConditions(List<DaemonSetCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public DaemonSetStatus withCurrentNumberScheduled(Integer currentNumberScheduled) {
        this.currentNumberScheduled = currentNumberScheduled;
        return this;
    }

    public DaemonSetStatus withDesiredNumberScheduled(Integer desiredNumberScheduled) {
        this.desiredNumberScheduled = desiredNumberScheduled;
        return this;
    }

    public DaemonSetStatus withNumberAvailable(Integer numberAvailable) {
        this.numberAvailable = numberAvailable;
        return this;
    }

    public DaemonSetStatus withNumberMisscheduled(Integer numberMisscheduled) {
        this.numberMisscheduled = numberMisscheduled;
        return this;
    }

    public DaemonSetStatus withNumberReady(Integer numberReady) {
        this.numberReady = numberReady;
        return this;
    }

    public DaemonSetStatus withNumberUnavailable(Integer numberUnavailable) {
        this.numberUnavailable = numberUnavailable;
        return this;
    }

    public DaemonSetStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public DaemonSetStatus withUpdatedNumberScheduled(Integer updatedNumberScheduled) {
        this.updatedNumberScheduled = updatedNumberScheduled;
        return this;
    }

}
