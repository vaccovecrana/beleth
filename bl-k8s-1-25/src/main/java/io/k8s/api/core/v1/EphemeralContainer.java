package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.
 *
 * To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.
 */
public class EphemeralContainer {
  public List<String> args;

  public List<String> command;

  public List<EnvVar> env;

  public List<EnvFromSource> envFrom;

  public String image;

  public String imagePullPolicy;

  public Lifecycle lifecycle;

  public Probe livenessProbe;

  public String name;

  public List<ContainerPort> ports;

  public Probe readinessProbe;

  public ResourceRequirements resources;

  public SecurityContext securityContext;

  public Probe startupProbe;

  public Boolean stdin;

  public Boolean stdinOnce;

  public String targetContainerName;

  public String terminationMessagePath;

  public String terminationMessagePolicy;

  public Boolean tty;

  public List<VolumeDevice> volumeDevices;

  public List<VolumeMount> volumeMounts;

  public String workingDir;

  /**
   * Arguments to the entrypoint. The image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   */
  public EphemeralContainer args(List<String> args) {
    this.args = args;
    return this;
  }

  /**
   * Entrypoint array. Not executed within a shell. The image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   */
  public EphemeralContainer command(List<String> command) {
    this.command = command;
    return this;
  }

  /**
   * List of environment variables to set in the container. Cannot be updated.
   */
  public EphemeralContainer env(List<EnvVar> env) {
    this.env = env;
    return this;
  }

  /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   */
  public EphemeralContainer envFrom(List<EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  /**
   * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images
   */
  public EphemeralContainer image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   *
   */
  public EphemeralContainer imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

  public EphemeralContainer lifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  public EphemeralContainer livenessProbe(Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

  /**
   * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
   */
  public EphemeralContainer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Ports are not allowed for ephemeral containers.
   */
  public EphemeralContainer ports(List<ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public EphemeralContainer readinessProbe(Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

  public EphemeralContainer resources(ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  public EphemeralContainer securityContext(SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

  public EphemeralContainer startupProbe(Probe startupProbe) {
    this.startupProbe = startupProbe;
    return this;
  }

  /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   */
  public EphemeralContainer stdin(Boolean stdin) {
    this.stdin = stdin;
    return this;
  }

  /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   */
  public EphemeralContainer stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
   *
   * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
   */
  public EphemeralContainer targetContainerName(String targetContainerName) {
    this.targetContainerName = targetContainerName;
    return this;
  }

  /**
   * Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   */
  public EphemeralContainer terminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

  /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   *
   */
  public EphemeralContainer terminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

  /**
   * Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
   */
  public EphemeralContainer tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * volumeDevices is the list of block devices to be used by the container.
   */
  public EphemeralContainer volumeDevices(List<VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
    return this;
  }

  /**
   * Pod volumes to mount into the container&#39;s filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
   */
  public EphemeralContainer volumeMounts(List<VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  /**
   * Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
   */
  public EphemeralContainer workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }
}
