
package io.k8s.api.core.v1;



/**
 * Represents storage that is managed by an external CSI volume driver (Beta feature)
 * 
 */
public class CSIPersistentVolumeSource {

    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference controllerExpandSecretRef;
    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference controllerPublishSecretRef;
    /**
     * driver is the name of the driver to use for this volume. Required.
     * (Required)
     * 
     */
    public String driver;
    /**
     * fsType to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
     * 
     */
    public String fsType;
    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference nodeExpandSecretRef;
    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference nodePublishSecretRef;
    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference nodeStageSecretRef;
    /**
     * readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
     * 
     */
    public Boolean readOnly;
    /**
     * volumeAttributes of the volume to publish.
     * 
     */
    public VolumeAttributes__1 volumeAttributes;
    /**
     * volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
     * (Required)
     * 
     */
    public String volumeHandle;

    public CSIPersistentVolumeSource withControllerExpandSecretRef(SecretReference controllerExpandSecretRef) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource withControllerPublishSecretRef(SecretReference controllerPublishSecretRef) {
        this.controllerPublishSecretRef = controllerPublishSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    public CSIPersistentVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public CSIPersistentVolumeSource withNodeExpandSecretRef(SecretReference nodeExpandSecretRef) {
        this.nodeExpandSecretRef = nodeExpandSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource withNodePublishSecretRef(SecretReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource withNodeStageSecretRef(SecretReference nodeStageSecretRef) {
        this.nodeStageSecretRef = nodeStageSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CSIPersistentVolumeSource withVolumeAttributes(VolumeAttributes__1 volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
        return this;
    }

    public CSIPersistentVolumeSource withVolumeHandle(String volumeHandle) {
        this.volumeHandle = volumeHandle;
        return this;
    }

}
