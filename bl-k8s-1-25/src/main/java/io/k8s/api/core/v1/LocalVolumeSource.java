
package io.k8s.api.core.v1;



/**
 * Local represents directly-attached storage with node affinity (Beta feature)
 * 
 */
public class LocalVolumeSource {

    /**
     * fsType is the filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a filesystem if unspecified.
     * 
     */
    public String fsType;
    /**
     * path of the full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
     * (Required)
     * 
     */
    public String path;

    public LocalVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public LocalVolumeSource withPath(String path) {
        this.path = path;
        return this;
    }

}
