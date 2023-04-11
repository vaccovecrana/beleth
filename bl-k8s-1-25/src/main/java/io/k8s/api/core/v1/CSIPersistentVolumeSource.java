package io.k8s.api.core.v1;

import io.k8s.api.core.v1.csipersistentvolumesource.VolumeAttributes;
import java.lang.Boolean;
import java.lang.String;

/**
 * Represents storage that is managed by an external CSI volume driver (Beta feature)
 */
public class CSIPersistentVolumeSource {
  public SecretReference controllerExpandSecretRef;

  public SecretReference controllerPublishSecretRef;

  public String driver;

  public String fsType;

  public SecretReference nodeExpandSecretRef;

  public SecretReference nodePublishSecretRef;

  public SecretReference nodeStageSecretRef;

  public Boolean readOnly;

  public VolumeAttributes volumeAttributes;

  public String volumeHandle;

  public CSIPersistentVolumeSource controllerExpandSecretRef(
      SecretReference controllerExpandSecretRef) {
    this.controllerExpandSecretRef = controllerExpandSecretRef;
    return this;
  }

  public CSIPersistentVolumeSource controllerPublishSecretRef(
      SecretReference controllerPublishSecretRef) {
    this.controllerPublishSecretRef = controllerPublishSecretRef;
    return this;
  }

  /**
   * driver is the name of the driver to use for this volume. Required.
   */
  public CSIPersistentVolumeSource driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * fsType to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;.
   */
  public CSIPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  public CSIPersistentVolumeSource nodeExpandSecretRef(SecretReference nodeExpandSecretRef) {
    this.nodeExpandSecretRef = nodeExpandSecretRef;
    return this;
  }

  public CSIPersistentVolumeSource nodePublishSecretRef(SecretReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
    return this;
  }

  public CSIPersistentVolumeSource nodeStageSecretRef(SecretReference nodeStageSecretRef) {
    this.nodeStageSecretRef = nodeStageSecretRef;
    return this;
  }

  /**
   * readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
   */
  public CSIPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * volumeAttributes of the volume to publish.
   */
  public CSIPersistentVolumeSource volumeAttributes(VolumeAttributes volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
    return this;
  }

  /**
   * volumeHandle is the unique volume name returned by the CSI volume plugin&#8217;s CreateVolume to refer to the volume on all subsequent calls. Required.
   */
  public CSIPersistentVolumeSource volumeHandle(String volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }
}
