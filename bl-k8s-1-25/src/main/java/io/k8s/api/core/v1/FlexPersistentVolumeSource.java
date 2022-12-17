
package io.k8s.api.core.v1;



/**
 * FlexPersistentVolumeSource represents a generic persistent volume resource that is provisioned/attached using an exec based plugin.
 * 
 */
public class FlexPersistentVolumeSource {

    /**
     * driver is the name of the driver to use for this volume.
     * (Required)
     * 
     */
    public String driver;
    /**
     * fsType is the Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
     * 
     */
    public String fsType;
    /**
     * options is Optional: this field holds extra command options if any.
     * 
     */
    public Options__1 options;
    /**
     * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;
    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference secretRef;

    public FlexPersistentVolumeSource withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    public FlexPersistentVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public FlexPersistentVolumeSource withOptions(Options__1 options) {
        this.options = options;
        return this;
    }

    public FlexPersistentVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public FlexPersistentVolumeSource withSecretRef(SecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

}
