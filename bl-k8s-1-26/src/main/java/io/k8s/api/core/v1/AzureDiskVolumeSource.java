
package io.k8s.api.core.v1;



/**
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 * 
 */
public class AzureDiskVolumeSource {

    /**
     * cachingMode is the Host Caching mode: None, Read Only, Read Write.
     * 
     */
    public String cachingMode;
    /**
     * diskName is the Name of the data disk in the blob storage
     * (Required)
     * 
     */
    public String diskName;
    /**
     * diskURI is the URI of data disk in the blob storage
     * (Required)
     * 
     */
    public String diskURI;
    /**
     * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    public String fsType;
    /**
     * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
     * 
     */
    public String kind;
    /**
     * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;

    public AzureDiskVolumeSource withCachingMode(String cachingMode) {
        this.cachingMode = cachingMode;
        return this;
    }

    public AzureDiskVolumeSource withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    public AzureDiskVolumeSource withDiskURI(String diskURI) {
        this.diskURI = diskURI;
        return this;
    }

    public AzureDiskVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public AzureDiskVolumeSource withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public AzureDiskVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

}
