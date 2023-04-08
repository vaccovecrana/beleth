
package io.k8s.api.batch.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * CronJobSpec describes how the job execution will look like and when it will actually run.
 * 
 */
public class CronJobSpec {

    /**
     * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
     * 
     * Possible enum values:
     *  - `"Allow"` allows CronJobs to run concurrently.
     *  - `"Forbid"` forbids concurrent runs, skipping next run if previous hasn't finished yet.
     *  - `"Replace"` cancels currently running job and replaces it with a new one.
     * 
     */
    public CronJobSpec.ConcurrencyPolicy concurrencyPolicy;
    /**
     * The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1.
     * 
     */
    public Integer failedJobsHistoryLimit;
    /**
     * JobTemplateSpec describes the data a Job should have when created from a template
     * (Required)
     * 
     */
    public JobTemplateSpec jobTemplate;
    /**
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * (Required)
     * 
     */
    public String schedule;
    /**
     * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
     * 
     */
    public Integer startingDeadlineSeconds;
    /**
     * The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3.
     * 
     */
    public Integer successfulJobsHistoryLimit;
    /**
     * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
     * 
     */
    public Boolean suspend;
    /**
     * The time zone name for the given schedule, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If not specified, this will default to the time zone of the kube-controller-manager process. The set of valid time zone names and the time zone offset is loaded from the system-wide time zone database by the API server during CronJob validation and the controller manager during execution. If no system-wide time zone database can be found a bundled version of the database is used instead. If the time zone name becomes invalid during the lifetime of a CronJob or due to a change in host configuration, the controller will stop creating new new Jobs and will create a system event with the reason UnknownTimeZone. More information can be found in https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/#time-zones This is beta field and must be enabled via the `CronJobTimeZone` feature gate.
     * 
     */
    public String timeZone;

    public CronJobSpec withConcurrencyPolicy(CronJobSpec.ConcurrencyPolicy concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
        return this;
    }

    public CronJobSpec withFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        return this;
    }

    public CronJobSpec withJobTemplate(JobTemplateSpec jobTemplate) {
        this.jobTemplate = jobTemplate;
        return this;
    }

    public CronJobSpec withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public CronJobSpec withStartingDeadlineSeconds(Integer startingDeadlineSeconds) {
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        return this;
    }

    public CronJobSpec withSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        return this;
    }

    public CronJobSpec withSuspend(Boolean suspend) {
        this.suspend = suspend;
        return this;
    }

    public CronJobSpec withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }


    /**
     * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
     * 
     * Possible enum values:
     *  - `"Allow"` allows CronJobs to run concurrently.
     *  - `"Forbid"` forbids concurrent runs, skipping next run if previous hasn't finished yet.
     *  - `"Replace"` cancels currently running job and replaces it with a new one.
     * 
     */
    public enum ConcurrencyPolicy {

        ALLOW("Allow"),
        FORBID("Forbid"),
        REPLACE("Replace");
        private final String value;
        private final static Map<String, CronJobSpec.ConcurrencyPolicy> CONSTANTS = new HashMap<String, CronJobSpec.ConcurrencyPolicy>();

        static {
            for (CronJobSpec.ConcurrencyPolicy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ConcurrencyPolicy(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CronJobSpec.ConcurrencyPolicy fromValue(String value) {
            CronJobSpec.ConcurrencyPolicy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
