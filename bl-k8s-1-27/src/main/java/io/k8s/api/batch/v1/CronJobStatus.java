package io.k8s.api.batch.v1;

import io.k8s.api.core.v1.ObjectReference;
import java.lang.String;
import java.util.List;

/**
 * CronJobStatus represents the current state of a cron job.
 */
public class CronJobStatus {
  public List<ObjectReference> active;

  public String lastScheduleTime;

  public String lastSuccessfulTime;

  /**
   * A list of pointers to currently running jobs.
   */
  public CronJobStatus active(List<ObjectReference> active) {
    this.active = active;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public CronJobStatus lastScheduleTime(String lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public CronJobStatus lastSuccessfulTime(String lastSuccessfulTime) {
    this.lastSuccessfulTime = lastSuccessfulTime;
    return this;
  }
}
