
package io.k8s.api.core.v1;



/**
 * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
 * 
 */
public class NodeSystemInfo {

    /**
     * The Architecture reported by the node
     * (Required)
     * 
     */
    public String architecture;
    /**
     * Boot ID reported by the node.
     * (Required)
     * 
     */
    public String bootID;
    /**
     * ContainerRuntime Version reported by the node through runtime remote API (e.g. containerd://1.4.2).
     * (Required)
     * 
     */
    public String containerRuntimeVersion;
    /**
     * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
     * (Required)
     * 
     */
    public String kernelVersion;
    /**
     * KubeProxy Version reported by the node.
     * (Required)
     * 
     */
    public String kubeProxyVersion;
    /**
     * Kubelet Version reported by the node.
     * (Required)
     * 
     */
    public String kubeletVersion;
    /**
     * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
     * (Required)
     * 
     */
    public String machineID;
    /**
     * The Operating System reported by the node
     * (Required)
     * 
     */
    public String operatingSystem;
    /**
     * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
     * (Required)
     * 
     */
    public String osImage;
    /**
     * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
     * (Required)
     * 
     */
    public String systemUUID;

    public NodeSystemInfo withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    public NodeSystemInfo withBootID(String bootID) {
        this.bootID = bootID;
        return this;
    }

    public NodeSystemInfo withContainerRuntimeVersion(String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
        return this;
    }

    public NodeSystemInfo withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    public NodeSystemInfo withKubeProxyVersion(String kubeProxyVersion) {
        this.kubeProxyVersion = kubeProxyVersion;
        return this;
    }

    public NodeSystemInfo withKubeletVersion(String kubeletVersion) {
        this.kubeletVersion = kubeletVersion;
        return this;
    }

    public NodeSystemInfo withMachineID(String machineID) {
        this.machineID = machineID;
        return this;
    }

    public NodeSystemInfo withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public NodeSystemInfo withOsImage(String osImage) {
        this.osImage = osImage;
        return this;
    }

    public NodeSystemInfo withSystemUUID(String systemUUID) {
        this.systemUUID = systemUUID;
        return this;
    }

}
