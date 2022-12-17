
package io.k8s.api.core.v1;



/**
 * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
 * 
 */
public class HostPathVolumeSource {

    /**
     * path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * (Required)
     * 
     */
    public String path;
    /**
     * type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    public String type;

    public HostPathVolumeSource withPath(String path) {
        this.path = path;
        return this;
    }

    public HostPathVolumeSource withType(String type) {
        this.type = type;
        return this;
    }

}
