package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * PortworxVolumeSource represents a Portworx volume resource.
 */
public class PortworxVolumeSource {
  public String fsType;

  public Boolean readOnly;

  public String volumeID;

  /**
   * fSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
   */
  public PortworxVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public PortworxVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * volumeID uniquely identifies a Portworx volume
   */
  public PortworxVolumeSource volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }
}
