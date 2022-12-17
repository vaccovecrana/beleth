
package io.k8s.api.batch.v1;

import java.util.List;


/**
 * JobStatus represents the current state of a Job.
 * 
 */
public class JobStatus {

    /**
     * The number of pending and running pods.
     * 
     */
    public Integer active;
    /**
     * CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7".
     * 
     */
    public String completedIndexes;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String completionTime;
    /**
     * The latest available observations of an object's current state. When a Job fails, one of the conditions will have type "Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type "Complete" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public List<JobCondition> conditions;
    /**
     * The number of pods which reached phase Failed.
     * 
     */
    public Integer failed;
    /**
     * The number of pods which have a Ready condition.
     * 
     * This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).
     * 
     */
    public Integer ready;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String startTime;
    /**
     * The number of pods which reached phase Succeeded.
     * 
     */
    public Integer succeeded;
    /**
     * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
     * 
     */
    public UncountedTerminatedPods uncountedTerminatedPods;

    public JobStatus withActive(Integer active) {
        this.active = active;
        return this;
    }

    public JobStatus withCompletedIndexes(String completedIndexes) {
        this.completedIndexes = completedIndexes;
        return this;
    }

    public JobStatus withCompletionTime(String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    public JobStatus withConditions(List<JobCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public JobStatus withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    public JobStatus withReady(Integer ready) {
        this.ready = ready;
        return this;
    }

    public JobStatus withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public JobStatus withSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    public JobStatus withUncountedTerminatedPods(UncountedTerminatedPods uncountedTerminatedPods) {
        this.uncountedTerminatedPods = uncountedTerminatedPods;
        return this;
    }

}
