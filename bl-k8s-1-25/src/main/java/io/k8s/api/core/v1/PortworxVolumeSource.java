
package io.k8s.api.core.v1;



/**
 * PortworxVolumeSource represents a Portworx volume resource.
 * 
 */
public class PortworxVolumeSource {

    /**
     * fSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    public String fsType;
    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;
    /**
     * volumeID uniquely identifies a Portworx volume
     * (Required)
     * 
     */
    public String volumeID;

    public PortworxVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public PortworxVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public PortworxVolumeSource withVolumeID(String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

}
