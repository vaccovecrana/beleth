
package io.k8s.api.core.v1;



/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 * 
 */
public class Lifecycle {

    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    public LifecycleHandler postStart;
    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    public LifecycleHandler preStop;

    public Lifecycle withPostStart(LifecycleHandler postStart) {
        this.postStart = postStart;
        return this;
    }

    public Lifecycle withPreStop(LifecycleHandler preStop) {
        this.preStop = preStop;
        return this;
    }

}
