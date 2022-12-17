
package io.k8s.api.core.v1;



/**
 * ContainerStateTerminated is a terminated state of a container.
 * 
 */
public class ContainerStateTerminated {

    /**
     * Container's ID in the format '<type>://<container_id>'
     * 
     */
    public String containerID;
    /**
     * Exit status from the last termination of the container
     * (Required)
     * 
     */
    public Integer exitCode;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String finishedAt;
    /**
     * Message regarding the last termination of the container
     * 
     */
    public String message;
    /**
     * (brief) reason from the last termination of the container
     * 
     */
    public String reason;
    /**
     * Signal from the last termination of the container
     * 
     */
    public Integer signal;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String startedAt;

    public ContainerStateTerminated withContainerID(String containerID) {
        this.containerID = containerID;
        return this;
    }

    public ContainerStateTerminated withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    public ContainerStateTerminated withFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public ContainerStateTerminated withMessage(String message) {
        this.message = message;
        return this;
    }

    public ContainerStateTerminated withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public ContainerStateTerminated withSignal(Integer signal) {
        this.signal = signal;
        return this;
    }

    public ContainerStateTerminated withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

}
