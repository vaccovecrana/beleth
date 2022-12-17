
package io.k8s.api.core.v1;



/**
 * ContainerStateRunning is a running state of a container.
 * 
 */
public class ContainerStateRunning {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String startedAt;

    public ContainerStateRunning withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

}
