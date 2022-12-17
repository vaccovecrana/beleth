
package io.k8s.api.core.v1;



/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 * 
 */
public class ScaleIOVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
     * 
     */
    public String fsType;
    /**
     * gateway is the host address of the ScaleIO API Gateway.
     * (Required)
     * 
     */
    public String gateway;
    /**
     * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    public String protectionDomain;
    /**
     * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * (Required)
     * 
     */
    public LocalObjectReference secretRef;
    /**
     * sslEnabled Flag enable/disable SSL communication with Gateway, default false
     * 
     */
    public Boolean sslEnabled;
    /**
     * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    public String storageMode;
    /**
     * storagePool is the ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    public String storagePool;
    /**
     * system is the name of the storage system as configured in ScaleIO.
     * (Required)
     * 
     */
    public String system;
    /**
     * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    public String volumeName;

    public ScaleIOVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public ScaleIOVolumeSource withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    public ScaleIOVolumeSource withProtectionDomain(String protectionDomain) {
        this.protectionDomain = protectionDomain;
        return this;
    }

    public ScaleIOVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public ScaleIOVolumeSource withSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public ScaleIOVolumeSource withSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
        return this;
    }

    public ScaleIOVolumeSource withStorageMode(String storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    public ScaleIOVolumeSource withStoragePool(String storagePool) {
        this.storagePool = storagePool;
        return this;
    }

    public ScaleIOVolumeSource withSystem(String system) {
        this.system = system;
        return this;
    }

    public ScaleIOVolumeSource withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

}
