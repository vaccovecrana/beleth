
package io.k8s.api.core.v1;



/**
 * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
 * 
 */
public class SecurityContext {

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Boolean allowPrivilegeEscalation;
    /**
     * Adds and removes POSIX capabilities from running containers.
     * 
     */
    public Capabilities capabilities;
    /**
     * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Boolean privileged;
    /**
     * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public String procMount;
    /**
     * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Boolean readOnlyRootFilesystem;
    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Integer runAsGroup;
    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    public Boolean runAsNonRoot;
    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
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
     * WindowsSecurityContextOptions contain Windows-specific options and credentials.
     * 
     */
    public WindowsSecurityContextOptions windowsOptions;

    public SecurityContext withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        return this;
    }

    public SecurityContext withCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public SecurityContext withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    public SecurityContext withProcMount(String procMount) {
        this.procMount = procMount;
        return this;
    }

    public SecurityContext withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        return this;
    }

    public SecurityContext withRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    public SecurityContext withRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
        return this;
    }

    public SecurityContext withRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    public SecurityContext withSeLinuxOptions(SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    public SecurityContext withSeccompProfile(SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
        return this;
    }

    public SecurityContext withWindowsOptions(WindowsSecurityContextOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
        return this;
    }

}
