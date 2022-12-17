
package io.k8s.api.core.v1;

import java.util.List;


/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public class CephFSPersistentVolumeSource {

    /**
     * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * (Required)
     * 
     */
    public List<String> monitors;
    /**
     * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    public String path;
    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Boolean readOnly;
    /**
     * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public String secretFile;
    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference secretRef;
    /**
     * user is Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public String user;

    public CephFSPersistentVolumeSource withMonitors(List<String> monitors) {
        this.monitors = monitors;
        return this;
    }

    public CephFSPersistentVolumeSource withPath(String path) {
        this.path = path;
        return this;
    }

    public CephFSPersistentVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CephFSPersistentVolumeSource withSecretFile(String secretFile) {
        this.secretFile = secretFile;
        return this;
    }

    public CephFSPersistentVolumeSource withSecretRef(SecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public CephFSPersistentVolumeSource withUser(String user) {
        this.user = user;
        return this;
    }

}
