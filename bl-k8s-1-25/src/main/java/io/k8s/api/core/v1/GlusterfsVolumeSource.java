
package io.k8s.api.core.v1;



/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public class GlusterfsVolumeSource {

    /**
     * endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * (Required)
     * 
     */
    public String endpoints;
    /**
     * path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * (Required)
     * 
     */
    public String path;
    /**
     * readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Boolean readOnly;

    public GlusterfsVolumeSource withEndpoints(String endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public GlusterfsVolumeSource withPath(String path) {
        this.path = path;
        return this;
    }

    public GlusterfsVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

}
