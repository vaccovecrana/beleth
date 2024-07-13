package io.k8s.api.core.v1;

import java.lang.String;

/**
 * volumeDevice describes a mapping of a raw block device within a container.
 */
public class VolumeDevice {
  public String devicePath;

  public String name;

  /**
   * devicePath is the path inside of the container that the device will be mapped to.
   */
  public VolumeDevice devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

  /**
   * name must match the name of a persistentVolumeClaim in the pod
   */
  public VolumeDevice name(String name) {
    this.name = name;
    return this;
  }

  public static VolumeDevice volumeDevice() {
    return new VolumeDevice();
  }
}
