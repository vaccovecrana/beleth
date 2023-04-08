
package io.k8s.api.core.v1;

import java.util.List;


/**
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 * 
 */
public class PodSecurityContext {

    /**
     * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * 
     *  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
     * 
     * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Integer fsGroup;
    /**
     * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified, "Always" is used. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public String fsGroupChangePolicy;
    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Integer runAsGroup;
    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    public Boolean runAsNonRoot;
    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Integer runAsUser;
    /**
     * SELinuxOptions are the labels to be applied to the container
     * 
     */
    public SELinuxOptions seLinuxOptions;
    /**
     * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
     * 
     */
    public SeccompProfile seccompProfile;
    /**
     * A list of groups applied to the first process run in each container, in addition to the container's primary GID, the fsGroup (if specified), and group memberships defined in the container image for the uid of the container process. If unspecified, no additional groups are added to any container. Note that group memberships defined in the container image for the uid of the container process are still effective, even if they are not included in this list. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public List<Integer> supplementalGroups;
    /**
     * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public List<Sysctl> sysctls;
    /**
     * WindowsSecurityContextOptions contain Windows-specific options and credentials.
     * 
     */
    public WindowsSecurityContextOptions windowsOptions;

    public PodSecurityContext withFsGroup(Integer fsGroup) {
        this.fsGroup = fsGroup;
        return this;
    }

    public PodSecurityContext withFsGroupChangePolicy(String fsGroupChangePolicy) {
        this.fsGroupChangePolicy = fsGroupChangePolicy;
        return this;
    }

    public PodSecurityContext withRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    public PodSecurityContext withRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
        return this;
    }

    public PodSecurityContext withRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    public PodSecurityContext withSeLinuxOptions(SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    public PodSecurityContext withSeccompProfile(SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
        return this;
    }

    public PodSecurityContext withSupplementalGroups(List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
        return this;
    }

    public PodSecurityContext withSysctls(List<Sysctl> sysctls) {
        this.sysctls = sysctls;
        return this;
    }

    public PodSecurityContext withWindowsOptions(WindowsSecurityContextOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
        return this;
    }

}
