
package io.k8s.api.core.v1;



/**
 * Represents a source location of a volume to mount, managed by an external CSI driver
 * 
 */
public class CSIVolumeSource {

    /**
     * driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * (Required)
     * 
     */
    public String driver;
    /**
     * fsType to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    public String fsType;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    public LocalObjectReference nodePublishSecretRef;
    /**
     * readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    public Boolean readOnly;
    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
     * 
     */
    public VolumeAttributes volumeAttributes;

    public CSIVolumeSource withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    public CSIVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public CSIVolumeSource withNodePublishSecretRef(LocalObjectReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
        return this;
    }

    public CSIVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CSIVolumeSource withVolumeAttributes(VolumeAttributes volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
        return this;
    }

}
