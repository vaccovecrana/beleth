package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * A single application container that you want to run within a pod.
 */
public class Container {
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

  public List<ContainerResizePolicy> resizePolicy;

  public ResourceRequirements resources;

  public String restartPolicy;

  public SecurityContext securityContext;

  public Probe startupProbe;

  public Boolean stdin;

  public Boolean stdinOnce;

  public String terminationMessagePath;

  public String terminationMessagePolicy;

  public Boolean tty;

  public List<VolumeDevice> volumeDevices;

  public List<VolumeMount> volumeMounts;

  public String workingDir;

  /**
   * Arguments to the entrypoint. The container image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   */
  public Container args(List<String> args) {
    this.args = args;
    return this;
  }

  /**
   * Entrypoint array. Not executed within a shell. The container image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   */
  public Container command(List<String> command) {
    this.command = command;
    return this;
  }

  /**
   * List of environment variables to set in the container. Cannot be updated.
   */
  public Container env(List<EnvVar> env) {
    this.env = env;
    return this;
  }

  /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   */
  public Container envFrom(List<EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  /**
   * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   */
  public Container image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   */
  public Container imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

  public Container lifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  public Container livenessProbe(Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

  /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   */
  public Container name(String name) {
    this.name = name;
    return this;
  }

  /**
   * List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default &#34;0.0.0.0&#34; address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.
   */
  public Container ports(List<ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public Container readinessProbe(Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

  /**
   * Resources resize policy for the container.
   */
  public Container resizePolicy(List<ContainerResizePolicy> resizePolicy) {
    this.resizePolicy = resizePolicy;
    return this;
  }

  public Container resources(ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  /**
   * RestartPolicy defines the restart behavior of individual containers in a pod. This field may only be set for init containers, and the only allowed value is &#34;Always&#34;. For non-init containers or when this field is not specified, the restart behavior is defined by the Pod&#39;s restart policy and the container type. Setting the RestartPolicy as &#34;Always&#34; for the init container will have the following effect: this init container will be continually restarted on exit until all regular containers have terminated. Once all regular containers have completed, all init containers with restartPolicy &#34;Always&#34; will be shut down. This lifecycle differs from normal init containers and is often referred to as a &#34;sidecar&#34; container. Although this init container still starts in the init container sequence, it does not wait for the container to complete before proceeding to the next init container. Instead, the next init container starts immediately after this init container is started, or after any startupProbe has successfully completed.
   */
  public Container restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  public Container securityContext(SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

  public Container startupProbe(Probe startupProbe) {
    this.startupProbe = startupProbe;
    return this;
  }

  /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   */
  public Container stdin(Boolean stdin) {
    this.stdin = stdin;
    return this;
  }

  /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   */
  public Container stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   */
  public Container terminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

  /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   */
  public Container terminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

  /**
   * Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
   */
  public Container tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * volumeDevices is the list of block devices to be used by the container.
   */
  public Container volumeDevices(List<VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
    return this;
  }

  /**
   * Pod volumes to mount into the container&#39;s filesystem. Cannot be updated.
   */
  public Container volumeMounts(List<VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  /**
   * Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
   */
  public Container workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }
}
