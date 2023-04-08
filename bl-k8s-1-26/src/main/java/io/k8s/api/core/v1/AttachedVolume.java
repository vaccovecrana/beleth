
package io.k8s.api.core.v1;



/**
 * AttachedVolume describes a volume attached to a node
 * 
 */
public class AttachedVolume {

    /**
     * DevicePath represents the device path where the volume should be available
     * (Required)
     * 
     */
    public String devicePath;
    /**
     * Name of the attached volume
     * (Required)
     * 
     */
    public String name;

    public AttachedVolume withDevicePath(String devicePath) {
        this.devicePath = devicePath;
        return this;
    }

    public AttachedVolume withName(String name) {
        this.name = name;
        return this;
    }

}
