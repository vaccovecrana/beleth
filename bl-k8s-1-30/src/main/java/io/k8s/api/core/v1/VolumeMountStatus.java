package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * VolumeMountStatus shows status of volume mounts.
 */
public class VolumeMountStatus {
  public String mountPath;

  public String name;

  public Boolean readOnly;

  public String recursiveReadOnly;

  /**
   * MountPath corresponds to the original VolumeMount.
   */
  public VolumeMountStatus mountPath(String mountPath) {
    this.mountPath = mountPath;
    return this;
  }

  /**
   * Name corresponds to the name of the original VolumeMount.
   */
  public VolumeMountStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ReadOnly corresponds to the original VolumeMount.
   */
  public VolumeMountStatus readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * RecursiveReadOnly must be set to Disabled, Enabled, or unspecified (for non-readonly mounts). An IfPossible value in the original VolumeMount must be translated to Disabled or Enabled, depending on the mount result.
   */
  public VolumeMountStatus recursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
    return this;
  }

  public static VolumeMountStatus volumeMountStatus() {
    return new VolumeMountStatus();
  }
}
