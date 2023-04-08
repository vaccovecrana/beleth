
package io.k8s.api.core.v1;



/**
 * Represents a Photon Controller persistent disk resource.
 * 
 */
public class PhotonPersistentDiskVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    public String fsType;
    /**
     * pdID is the ID that identifies Photon Controller persistent disk
     * (Required)
     * 
     */
    public String pdID;

    public PhotonPersistentDiskVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public PhotonPersistentDiskVolumeSource withPdID(String pdID) {
        this.pdID = pdID;
        return this;
    }

}
