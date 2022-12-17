
package io.k8s.api.core.v1;



/**
 * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
 * 
 */
public class NFSVolumeSource {

    /**
     * path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * (Required)
     * 
     */
    public String path;
    /**
     * readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    public Boolean readOnly;
    /**
     * server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * (Required)
     * 
     */
    public String server;

    public NFSVolumeSource withPath(String path) {
        this.path = path;
        return this;
    }

    public NFSVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public NFSVolumeSource withServer(String server) {
        this.server = server;
        return this;
    }

}
