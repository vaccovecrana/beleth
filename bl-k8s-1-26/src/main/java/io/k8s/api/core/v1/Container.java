
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A single application container that you want to run within a pod.
 * 
 */
public class Container {

    /**
     * Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public List<String> args;
    /**
     * Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
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
     * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
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
    public Container.ImagePullPolicy imagePullPolicy;
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
     * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
     * (Required)
     * 
     */
    public String name;
    /**
     * List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.
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
    public Container.TerminationMessagePolicy terminationMessagePolicy;
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
     * Pod volumes to mount into the container's filesystem. Cannot be updated.
     * 
     */
    public List<VolumeMount> volumeMounts;
    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    public String workingDir;

    public Container withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public Container withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public Container withEnv(List<EnvVar> env) {
        this.env = env;
        return this;
    }

    public Container withEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    public Container withImage(String image) {
        this.image = image;
        return this;
    }

    public Container withImagePullPolicy(Container.ImagePullPolicy imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    public Container withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    public Container withLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public Container withName(String name) {
        this.name = name;
        return this;
    }

    public Container withPorts(List<ContainerPort> ports) {
        this.ports = ports;
        return this;
    }

    public Container withReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public Container withResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    public Container withSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    public Container withStartupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    public Container withStdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    public Container withStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    public Container withTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
        return this;
    }

    public Container withTerminationMessagePolicy(Container.TerminationMessagePolicy terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
        return this;
    }

    public Container withTty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    public Container withVolumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
        return this;
    }

    public Container withVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    public Container withWorkingDir(String workingDir) {
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
        private final static Map<String, Container.ImagePullPolicy> CONSTANTS = new HashMap<String, Container.ImagePullPolicy>();

        static {
            for (Container.ImagePullPolicy c: values()) {
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

        public static Container.ImagePullPolicy fromValue(String value) {
            Container.ImagePullPolicy constant = CONSTANTS.get(value);
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
        private final static Map<String, Container.TerminationMessagePolicy> CONSTANTS = new HashMap<String, Container.TerminationMessagePolicy>();

        static {
            for (Container.TerminationMessagePolicy c: values()) {
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

        public static Container.TerminationMessagePolicy fromValue(String value) {
            Container.TerminationMessagePolicy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
