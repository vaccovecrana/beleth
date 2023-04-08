
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.
 * 
 * To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.
 * 
 */
public class EphemeralContainer {

    /**
     * Arguments to the entrypoint. The image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public List<String> args;
    /**
     * Entrypoint array. Not executed within a shell. The image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public List<String> command;
    /**
     * List of environment variables to set in the container. Cannot be updated.
     * 
     */
    public List<EnvVar> env;
    /**
     * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    public List<EnvFromSource> envFrom;
    /**
     * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    public String image;
    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     * Possible enum values:
     *  - `"Always"` means that kubelet always attempts to pull the latest image. Container will fail If the pull fails.
     *  - `"IfNotPresent"` means that kubelet pulls if the image isn't present on disk. Container will fail if the image isn't present and the pull fails.
     *  - `"Never"` means that kubelet never pulls an image, but only uses a local image. Container will fail if the image isn't present
     * 
     */
    public EphemeralContainer.ImagePullPolicy imagePullPolicy;
    /**
     * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
     * 
     */
    public Lifecycle lifecycle;
    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    public Probe livenessProbe;
    /**
     * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
     * (Required)
     * 
     */
    public String name;
    /**
     * Ports are not allowed for ephemeral containers.
     * 
     */
    public List<ContainerPort> ports;
    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    public Probe readinessProbe;
    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    public ResourceRequirements resources;
    /**
     * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
     * 
     */
    public SecurityContext securityContext;
    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    public Probe startupProbe;
    /**
     * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
     */
    public Boolean stdin;
    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
     */
    public Boolean stdinOnce;
    /**
     * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
     * 
     * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
     * 
     */
    public String targetContainerName;
    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
     */
    public String terminationMessagePath;
    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     * Possible enum values:
     *  - `"FallbackToLogsOnError"` will read the most recent contents of the container logs for the container status message when the container exits with an error and the terminationMessagePath has no contents.
     *  - `"File"` is the default behavior and will set the container status message to the contents of the container's terminationMessagePath when the container exits.
     * 
     */
    public EphemeralContainer.TerminationMessagePolicy terminationMessagePolicy;
    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
     * 
     */
    public Boolean tty;
    /**
     * volumeDevices is the list of block devices to be used by the container.
     * 
     */
    public List<VolumeDevice> volumeDevices;
    /**
     * Pod volumes to mount into the container's filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
     * 
     */
    public List<VolumeMount> volumeMounts;
    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    public String workingDir;

    public EphemeralContainer withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public EphemeralContainer withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public EphemeralContainer withEnv(List<EnvVar> env) {
        this.env = env;
        return this;
    }

    public EphemeralContainer withEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    public EphemeralContainer withImage(String image) {
        this.image = image;
        return this;
    }

    public EphemeralContainer withImagePullPolicy(EphemeralContainer.ImagePullPolicy imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    public EphemeralContainer withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    public EphemeralContainer withLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public EphemeralContainer withName(String name) {
        this.name = name;
        return this;
    }

    public EphemeralContainer withPorts(List<ContainerPort> ports) {
        this.ports = ports;
        return this;
    }

    public EphemeralContainer withReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public EphemeralContainer withResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    public EphemeralContainer withSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    public EphemeralContainer withStartupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    public EphemeralContainer withStdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    public EphemeralContainer withStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    public EphemeralContainer withTargetContainerName(String targetContainerName) {
        this.targetContainerName = targetContainerName;
        return this;
    }

    public EphemeralContainer withTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
        return this;
    }

    public EphemeralContainer withTerminationMessagePolicy(EphemeralContainer.TerminationMessagePolicy terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
        return this;
    }

    public EphemeralContainer withTty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    public EphemeralContainer withVolumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
        return this;
    }

    public EphemeralContainer withVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    public EphemeralContainer withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }


    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     * Possible enum values:
     *  - `"Always"` means that kubelet always attempts to pull the latest image. Container will fail If the pull fails.
     *  - `"IfNotPresent"` means that kubelet pulls if the image isn't present on disk. Container will fail if the image isn't present and the pull fails.
     *  - `"Never"` means that kubelet never pulls an image, but only uses a local image. Container will fail if the image isn't present
     * 
     */
    public enum ImagePullPolicy {

        ALWAYS("Always"),
        IF_NOT_PRESENT("IfNotPresent"),
        NEVER("Never");
        private final String value;
        private final static Map<String, EphemeralContainer.ImagePullPolicy> CONSTANTS = new HashMap<String, EphemeralContainer.ImagePullPolicy>();

        static {
            for (EphemeralContainer.ImagePullPolicy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ImagePullPolicy(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static EphemeralContainer.ImagePullPolicy fromValue(String value) {
            EphemeralContainer.ImagePullPolicy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     * Possible enum values:
     *  - `"FallbackToLogsOnError"` will read the most recent contents of the container logs for the container status message when the container exits with an error and the terminationMessagePath has no contents.
     *  - `"File"` is the default behavior and will set the container status message to the contents of the container's terminationMessagePath when the container exits.
     * 
     */
    public enum TerminationMessagePolicy {

        FALLBACK_TO_LOGS_ON_ERROR("FallbackToLogsOnError"),
        FILE("File");
        private final String value;
        private final static Map<String, EphemeralContainer.TerminationMessagePolicy> CONSTANTS = new HashMap<String, EphemeralContainer.TerminationMessagePolicy>();

        static {
            for (EphemeralContainer.TerminationMessagePolicy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TerminationMessagePolicy(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static EphemeralContainer.TerminationMessagePolicy fromValue(String value) {
            EphemeralContainer.TerminationMessagePolicy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
