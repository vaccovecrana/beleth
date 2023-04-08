
package io.k8s.api.core.v1;



/**
 * ContainerStatus contains details for the current status of this container.
 * 
 */
public class ContainerStatus {

    /**
     * Container's ID in the format '<type>://<container_id>'.
     * 
     */
    public String containerID;
    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * (Required)
     * 
     */
    public String image;
    /**
     * ImageID of the container's image.
     * (Required)
     * 
     */
    public String imageID;
    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    public ContainerState lastState;
    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * (Required)
     * 
     */
    public String name;
    /**
     * Specifies whether the container has passed its readiness probe.
     * (Required)
     * 
     */
    public Boolean ready;
    /**
     * The number of times the container has been restarted.
     * (Required)
     * 
     */
    public Integer restartCount;
    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
     */
    public Boolean started;
    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    public ContainerState state;

    public ContainerStatus withContainerID(String containerID) {
        this.containerID = containerID;
        return this;
    }

    public ContainerStatus withImage(String image) {
        this.image = image;
        return this;
    }

    public ContainerStatus withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    public ContainerStatus withLastState(ContainerState lastState) {
        this.lastState = lastState;
        return this;
    }

    public ContainerStatus withName(String name) {
        this.name = name;
        return this;
    }

    public ContainerStatus withReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    public ContainerStatus withRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    public ContainerStatus withStarted(Boolean started) {
        this.started = started;
        return this;
    }

    public ContainerStatus withState(ContainerState state) {
        this.state = state;
        return this;
    }

}
