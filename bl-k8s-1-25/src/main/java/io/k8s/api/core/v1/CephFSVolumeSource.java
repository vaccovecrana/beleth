
package io.k8s.api.core.v1;

import java.util.List;


/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public class CephFSVolumeSource {

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
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    public LocalObjectReference secretRef;
    /**
     * user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public String user;

    public CephFSVolumeSource withMonitors(List<String> monitors) {
        this.monitors = monitors;
        return this;
    }

    public CephFSVolumeSource withPath(String path) {
        this.path = path;
        return this;
    }

    public CephFSVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CephFSVolumeSource withSecretFile(String secretFile) {
        this.secretFile = secretFile;
        return this;
    }

    public CephFSVolumeSource withSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public CephFSVolumeSource withUser(String user) {
        this.user = user;
        return this;
    }

}
