package io.k8s.api.core.v1;

import io.k8s.api.core.v1.csivolumesource.VolumeAttributes;
import java.lang.Boolean;
import java.lang.String;

/**
 * Represents a source location of a volume to mount, managed by an external CSI driver
 */
public class CSIVolumeSource {
  public String driver;

  public String fsType;

  public LocalObjectReference nodePublishSecretRef;

  public Boolean readOnly;

  public VolumeAttributes volumeAttributes;

  /**
   * driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
   */
  public CSIVolumeSource driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * fsType to mount. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
   */
  public CSIVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  public CSIVolumeSource nodePublishSecretRef(LocalObjectReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
    return this;
  }

  /**
   * readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
   */
  public CSIVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values.
   */
  public CSIVolumeSource volumeAttributes(VolumeAttributes volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
    return this;
  }
}
