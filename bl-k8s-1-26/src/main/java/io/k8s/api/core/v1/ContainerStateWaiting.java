
package io.k8s.api.core.v1;



/**
 * ContainerStateWaiting is a waiting state of a container.
 * 
 */
public class ContainerStateWaiting {

    /**
     * Message regarding why the container is not yet running.
     * 
     */
    public String message;
    /**
     * (brief) reason the container is not yet running.
     * 
     */
    public String reason;

    public ContainerStateWaiting withMessage(String message) {
        this.message = message;
        return this;
    }

    public ContainerStateWaiting withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
