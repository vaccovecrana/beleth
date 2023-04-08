
package io.k8s.api.core.v1;

import java.util.List;


/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
 * 
 */
public class RBDPersistentVolumeSource {

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
     */
    public String fsType;
    /**
     * image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * (Required)
     * 
     */
    public String image;
    /**
     * keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public String keyring;
    /**
     * monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * (Required)
     * 
     */
    public List<String> monitors;
    /**
     * pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public String pool;
    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public Boolean readOnly;
    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference secretRef;
    /**
     * user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public String user;

    public RBDPersistentVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public RBDPersistentVolumeSource withImage(String image) {
        this.image = image;
        return this;
    }

    public RBDPersistentVolumeSource withKeyring(String keyring) {
        this.keyring = keyring;
        return this;
    }

    public RBDPersistentVolumeSource withMonitors(List<String> monitors) {
        this.monitors = monitors;
        return this;
    }

    public RBDPersistentVolumeSource withPool(String pool) {
        this.pool = pool;
        return this;
    }

    public RBDPersistentVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public RBDPersistentVolumeSource withSecretRef(SecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public RBDPersistentVolumeSource withUser(String user) {
        this.user = user;
        return this;
    }

}
