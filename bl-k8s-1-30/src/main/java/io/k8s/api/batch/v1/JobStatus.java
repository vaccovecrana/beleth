package io.k8s.api.batch.v1;

import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * JobStatus represents the current state of a Job.
 */
public class JobStatus {
  public Long active;

  public String completedIndexes;

  public String completionTime;

  public List<JobCondition> conditions;

  public Long failed;

  public String failedIndexes;

  public Long ready;

  public String startTime;

  public Long succeeded;

  public Long terminating;

  public UncountedTerminatedPods uncountedTerminatedPods;

  /**
   * The number of pending and running pods which are not terminating (without a deletionTimestamp). The value is zero for finished jobs.
   */
  public JobStatus active(Long active) {
    this.active = active;
    return this;
  }

  /**
   * completedIndexes holds the completed indexes when .spec.completionMode = &#34;Indexed&#34; in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;.
   */
  public JobStatus completedIndexes(String completedIndexes) {
    this.completedIndexes = completedIndexes;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public JobStatus completionTime(String completionTime) {
    this.completionTime = completionTime;
    return this;
  }

  /**
   * The latest available observations of an object&#39;s current state. When a Job fails, one of the conditions will have type &#34;Failed&#34; and status true. When a Job is suspended, one of the conditions will have type &#34;Suspended&#34; and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type &#34;Complete&#34; and status true.
   *
   * A job is considered finished when it is in a terminal condition, either &#34;Complete&#34; or &#34;Failed&#34;. A Job cannot have both the &#34;Complete&#34; and &#34;Failed&#34; conditions. Additionally, it cannot be in the &#34;Complete&#34; and &#34;FailureTarget&#34; conditions. The &#34;Complete&#34;, &#34;Failed&#34; and &#34;FailureTarget&#34; conditions cannot be disabled.
   *
   * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   */
  public JobStatus conditions(List<JobCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The number of pods which reached phase Failed. The value increases monotonically.
   */
  public JobStatus failed(Long failed) {
    this.failed = failed;
    return this;
  }

  /**
   * FailedIndexes holds the failed indexes when spec.backoffLimitPerIndex is set. The indexes are represented in the text format analogous as for the `completedIndexes` field, ie. they are kept as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the failed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;. The set of failed indexes cannot overlap with the set of completed indexes.
   *
   * This field is beta-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
   */
  public JobStatus failedIndexes(String failedIndexes) {
    this.failedIndexes = failedIndexes;
    return this;
  }

  /**
   * The number of pods which have a Ready condition.
   */
  public JobStatus ready(Long ready) {
    this.ready = ready;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public JobStatus startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The number of pods which reached phase Succeeded. The value increases monotonically for a given spec. However, it may decrease in reaction to scale down of elastic indexed jobs.
   */
  public JobStatus succeeded(Long succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  /**
   * The number of pods which are terminating (in phase Pending or Running and have a deletionTimestamp).
   *
   * This field is beta-level. The job controller populates the field when the feature gate JobPodReplacementPolicy is enabled (enabled by default).
   */
  public JobStatus terminating(Long terminating) {
    this.terminating = terminating;
    return this;
  }

  public JobStatus uncountedTerminatedPods(UncountedTerminatedPods uncountedTerminatedPods) {
    this.uncountedTerminatedPods = uncountedTerminatedPods;
    return this;
  }
}
