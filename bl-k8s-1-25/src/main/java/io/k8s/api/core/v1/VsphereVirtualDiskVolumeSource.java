
package io.k8s.api.core.v1;



/**
 * Represents a vSphere volume resource.
 * 
 */
public class VsphereVirtualDiskVolumeSource {

    /**
     * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    public String fsType;
    /**
     * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    public String storagePolicyID;
    /**
     * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     * 
     */
    public String storagePolicyName;
    /**
     * volumePath is the path that identifies vSphere volume vmdk
     * (Required)
     * 
     */
    public String volumePath;

    public VsphereVirtualDiskVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public VsphereVirtualDiskVolumeSource withStoragePolicyID(String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
        return this;
    }

    public VsphereVirtualDiskVolumeSource withStoragePolicyName(String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
        return this;
    }

    public VsphereVirtualDiskVolumeSource withVolumePath(String volumePath) {
        this.volumePath = volumePath;
        return this;
    }

}
