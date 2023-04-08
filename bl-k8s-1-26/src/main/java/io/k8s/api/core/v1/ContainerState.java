
package io.k8s.api.core.v1;



/**
 * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
 * 
 */
public class ContainerState {

    /**
     * ContainerStateRunning is a running state of a container.
     * 
     */
    public ContainerStateRunning running;
    /**
     * ContainerStateTerminated is a terminated state of a container.
     * 
     */
    public ContainerStateTerminated terminated;
    /**
     * ContainerStateWaiting is a waiting state of a container.
     * 
     */
    public ContainerStateWaiting waiting;

    public ContainerState withRunning(ContainerStateRunning running) {
        this.running = running;
        return this;
    }

    public ContainerState withTerminated(ContainerStateTerminated terminated) {
        this.terminated = terminated;
        return this;
    }

    public ContainerState withWaiting(ContainerStateWaiting waiting) {
        this.waiting = waiting;
        return this;
    }

}
