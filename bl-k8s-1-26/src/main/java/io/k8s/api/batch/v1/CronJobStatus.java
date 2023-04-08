
package io.k8s.api.batch.v1;

import java.util.List;
import io.k8s.api.core.v1.ObjectReference;


/**
 * CronJobStatus represents the current state of a cron job.
 * 
 */
public class CronJobStatus {

    /**
     * A list of pointers to currently running jobs.
     * 
     */
    public List<ObjectReference> active;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastScheduleTime;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastSuccessfulTime;

    public CronJobStatus withActive(List<ObjectReference> active) {
        this.active = active;
        return this;
    }

    public CronJobStatus withLastScheduleTime(String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
        return this;
    }

    public CronJobStatus withLastSuccessfulTime(String lastSuccessfulTime) {
        this.lastSuccessfulTime = lastSuccessfulTime;
        return this;
    }

}
