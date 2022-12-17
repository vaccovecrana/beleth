
package io.k8s.api.core.v1;



/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public class GlusterfsPersistentVolumeSource {

    /**
     * endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * (Required)
     * 
     */
    public String endpoints;
    /**
     * endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public String endpointsNamespace;
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

    public GlusterfsPersistentVolumeSource withEndpoints(String endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public GlusterfsPersistentVolumeSource withEndpointsNamespace(String endpointsNamespace) {
        this.endpointsNamespace = endpointsNamespace;
        return this;
    }

    public GlusterfsPersistentVolumeSource withPath(String path) {
        this.path = path;
        return this;
    }

    public GlusterfsPersistentVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

}
