
package io.k8s.api.core.v1;



/**
 * Represents a StorageOS persistent volume resource.
 * 
 */
public class StorageOSVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    public String fsType;
    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    public LocalObjectReference secretRef;
    /**
     * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    public String volumeName;
    /**
     * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    public String volumeNamespace;

    public StorageOSVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public StorageOSVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public StorageOSVolumeSource withSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public StorageOSVolumeSource withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    public StorageOSVolumeSource withVolumeNamespace(String volumeNamespace) {
        this.volumeNamespace = volumeNamespace;
        return this;
    }

}
