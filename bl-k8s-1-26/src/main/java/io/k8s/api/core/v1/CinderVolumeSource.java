
package io.k8s.api.core.v1;



/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 * 
 */
public class CinderVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    public String fsType;
    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    public Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    public LocalObjectReference secretRef;
    /**
     * volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * (Required)
     * 
     */
    public String volumeID;

    public CinderVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public CinderVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CinderVolumeSource withSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public CinderVolumeSource withVolumeID(String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

}
