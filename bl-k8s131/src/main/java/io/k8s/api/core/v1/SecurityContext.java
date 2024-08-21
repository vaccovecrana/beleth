package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
 */
public class SecurityContext {
  public Boolean allowPrivilegeEscalation;

  public AppArmorProfile appArmorProfile;

  public Capabilities capabilities;

  public Boolean privileged;

  public String procMount;

  public Boolean readOnlyRootFilesystem;

  public Long runAsGroup;

  public Boolean runAsNonRoot;

  public Long runAsUser;

  public SELinuxOptions seLinuxOptions;

  public SeccompProfile seccompProfile;

  public WindowsSecurityContextOptions windowsOptions;

  /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
   */
  public SecurityContext allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

  public SecurityContext appArmorProfile(AppArmorProfile appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
    return this;
  }

  public SecurityContext capabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
   */
  public SecurityContext privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * procMount denotes the type of proc mount to use for the containers. The default value is Default which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
   */
  public SecurityContext procMount(String procMount) {
    this.procMount = procMount;
    return this;
  }

  /**
   * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
   */
  public SecurityContext readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
   */
  public SecurityContext runAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   */
  public SecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
   */
  public SecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  public SecurityContext seLinuxOptions(SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  public SecurityContext seccompProfile(SeccompProfile seccompProfile) {
    this.seccompProfile = seccompProfile;
    return this;
  }

  public SecurityContext windowsOptions(WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
    return this;
  }

  public static SecurityContext securityContext() {
    return new SecurityContext();
  }
}
