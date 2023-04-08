
package io.k8s.api.core.v1;



/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 * 
 */
public class DownwardAPIVolumeFile {

    /**
     * ObjectFieldSelector selects an APIVersioned field of an object.
     * 
     */
    public ObjectFieldSelector fieldRef;
    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Integer mode;
    /**
     * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     * (Required)
     * 
     */
    public String path;
    /**
     * ResourceFieldSelector represents container resources (cpu, memory) and their output format
     * 
     */
    public ResourceFieldSelector resourceFieldRef;

    public DownwardAPIVolumeFile withFieldRef(ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }

    public DownwardAPIVolumeFile withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    public DownwardAPIVolumeFile withPath(String path) {
        this.path = path;
        return this;
    }

    public DownwardAPIVolumeFile withResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
        return this;
    }

}
