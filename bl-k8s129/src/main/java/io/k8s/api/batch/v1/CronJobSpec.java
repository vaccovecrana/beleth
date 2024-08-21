package io.k8s.api.batch.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * CronJobSpec describes how the job execution will look like and when it will actually run.
 */
public class CronJobSpec {
  public String concurrencyPolicy;

  public Long failedJobsHistoryLimit;

  public JobTemplateSpec jobTemplate;

  public String schedule;

  public Long startingDeadlineSeconds;

  public Long successfulJobsHistoryLimit;

  public Boolean suspend;

  public String timeZone;

  /**
   * Specifies how to treat concurrent executions of a Job. Valid values are:
   *
   * - &#34;Allow&#34; (default): allows CronJobs to run concurrently; - &#34;Forbid&#34;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - &#34;Replace&#34;: cancels currently running job and replaces it with a new one
   */
  public CronJobSpec concurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
    return this;
  }

  /**
   * The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1.
   */
  public CronJobSpec failedJobsHistoryLimit(Long failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    return this;
  }

  public CronJobSpec jobTemplate(JobTemplateSpec jobTemplate) {
    this.jobTemplate = jobTemplate;
    return this;
  }

  /**
   * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
   */
  public CronJobSpec schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
   */
  public CronJobSpec startingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return this;
  }

  /**
   * The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3.
   */
  public CronJobSpec successfulJobsHistoryLimit(Long successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    return this;
  }

  /**
   * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
   */
  public CronJobSpec suspend(Boolean suspend) {
    this.suspend = suspend;
    return this;
  }

  /**
   * The time zone name for the given schedule, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If not specified, this will default to the time zone of the kube-controller-manager process. The set of valid time zone names and the time zone offset is loaded from the system-wide time zone database by the API server during CronJob validation and the controller manager during execution. If no system-wide time zone database can be found a bundled version of the database is used instead. If the time zone name becomes invalid during the lifetime of a CronJob or due to a change in host configuration, the controller will stop creating new new Jobs and will create a system event with the reason UnknownTimeZone. More information can be found in https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/#time-zones
   */
  public CronJobSpec timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  public static CronJobSpec cronJobSpec() {
    return new CronJobSpec();
  }
}
