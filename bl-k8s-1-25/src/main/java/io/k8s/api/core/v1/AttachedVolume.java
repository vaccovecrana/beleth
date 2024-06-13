package io.k8s.api.core.v1;

import java.lang.String;

/**
 * AttachedVolume describes a volume attached to a node
 */
public class AttachedVolume {
  public String devicePath;

  public String name;

  /**
   * DevicePath represents the device path where the volume should be available
   */
  public AttachedVolume devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

  /**
   * Name of the attached volume
   */
  public AttachedVolume name(String name) {
    this.name = name;
    return this;
  }

  public static AttachedVolume attachedVolume() {
    return new AttachedVolume();
  }
}
