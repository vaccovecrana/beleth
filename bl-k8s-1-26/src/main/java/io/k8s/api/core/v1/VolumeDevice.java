
package io.k8s.api.core.v1;



/**
 * volumeDevice describes a mapping of a raw block device within a container.
 * 
 */
public class VolumeDevice {

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * (Required)
     * 
     */
    public String devicePath;
    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * (Required)
     * 
     */
    public String name;

    public VolumeDevice withDevicePath(String devicePath) {
        this.devicePath = devicePath;
        return this;
    }

    public VolumeDevice withName(String name) {
        this.name = name;
        return this;
    }

}
