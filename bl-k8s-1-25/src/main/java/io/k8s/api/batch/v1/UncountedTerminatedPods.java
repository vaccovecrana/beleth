
package io.k8s.api.batch.v1;

import java.util.List;


/**
 * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
 * 
 */
public class UncountedTerminatedPods {

    /**
     * Failed holds UIDs of failed Pods.
     * 
     */
    public List<String> failed;
    /**
     * Succeeded holds UIDs of succeeded Pods.
     * 
     */
    public List<String> succeeded;

    public UncountedTerminatedPods withFailed(List<String> failed) {
        this.failed = failed;
        return this;
    }

    public UncountedTerminatedPods withSucceeded(List<String> succeeded) {
        this.succeeded = succeeded;
        return this;
    }

}
