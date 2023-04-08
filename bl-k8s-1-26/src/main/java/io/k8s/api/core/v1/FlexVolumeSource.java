
package io.k8s.api.core.v1;



/**
 * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
 * 
 */
public class FlexVolumeSource {

    /**
     * driver is the name of the driver to use for this volume.
     * (Required)
     * 
     */
    public String driver;
    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
     * 
     */
    public String fsType;
    /**
     * options is Optional: this field holds extra command options if any.
     * 
     */
    public Options options;
    /**
     * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    public LocalObjectReference secretRef;

    public FlexVolumeSource withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    public FlexVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public FlexVolumeSource withOptions(Options options) {
        this.options = options;
        return this;
    }

    public FlexVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public FlexVolumeSource withSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

}
