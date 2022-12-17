
package io.k8s.api.core.v1;

import java.util.List;


/**
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 * 
 */
public class FCVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    public String fsType;
    /**
     * lun is Optional: FC target lun number
     * 
     */
    public Integer lun;
    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;
    /**
     * targetWWNs is Optional: FC target worldwide names (WWNs)
     * 
     */
    public List<String> targetWWNs;
    /**
     * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    public List<String> wwids;

    public FCVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public FCVolumeSource withLun(Integer lun) {
        this.lun = lun;
        return this;
    }

    public FCVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public FCVolumeSource withTargetWWNs(List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
        return this;
    }

    public FCVolumeSource withWwids(List<String> wwids) {
        this.wwids = wwids;
        return this;
    }

}
