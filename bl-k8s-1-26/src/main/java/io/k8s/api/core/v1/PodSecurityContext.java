package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 */
public class PodSecurityContext {
  public Long fsGroup;

  public String fsGroupChangePolicy;

  public Long runAsGroup;

  public Boolean runAsNonRoot;

  public Long runAsUser;

  public SELinuxOptions seLinuxOptions;

  public SeccompProfile seccompProfile;

  public List<Long> supplementalGroups;

  public List<Sysctl> sysctls;

  public WindowsSecurityContextOptions windowsOptions;

  /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
   *
   * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw----
   *
   * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
   */
  public PodSecurityContext fsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

  /**
   * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are &#34;OnRootMismatch&#34; and &#34;Always&#34;. If not specified, &#34;Always&#34; is used. Note that this field cannot be set when spec.os.name is windows.
   */
  public PodSecurityContext fsGroupChangePolicy(String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
   */
  public PodSecurityContext runAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   */
  public PodSecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
   */
  public PodSecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  public PodSecurityContext seLinuxOptions(SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  public PodSecurityContext seccompProfile(SeccompProfile seccompProfile) {
    this.seccompProfile = seccompProfile;
    return this;
  }

  /**
   * A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID, the fsGroup (if specified), and group memberships defined in the container image for the uid of the container process. If unspecified, no additional groups are added to any container. Note that group memberships defined in the container image for the uid of the container process are still effective, even if they are not included in this list. Note that this field cannot be set when spec.os.name is windows.
   */
  public PodSecurityContext supplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  /**
   * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
   */
  public PodSecurityContext sysctls(List<Sysctl> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public PodSecurityContext windowsOptions(WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
    return this;
  }

  public static PodSecurityContext podSecurityContext() {
    return new PodSecurityContext();
  }
}
