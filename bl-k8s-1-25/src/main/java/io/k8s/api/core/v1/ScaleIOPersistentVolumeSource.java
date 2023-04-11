package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
 */
public class ScaleIOPersistentVolumeSource {
  public String fsType;

  public String gateway;

  public String protectionDomain;

  public Boolean readOnly;

  public SecretReference secretRef;

  public Boolean sslEnabled;

  public String storageMode;

  public String storagePool;

  public String system;

  public String volumeName;

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Default is &#34;xfs&#34;
   */
  public ScaleIOPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * gateway is the host address of the ScaleIO API Gateway.
   */
  public ScaleIOPersistentVolumeSource gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
   */
  public ScaleIOPersistentVolumeSource protectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return this;
  }

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public ScaleIOPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public ScaleIOPersistentVolumeSource secretRef(SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * sslEnabled is the flag to enable/disable SSL communication with Gateway, default false
   */
  public ScaleIOPersistentVolumeSource sslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

  /**
   * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
   */
  public ScaleIOPersistentVolumeSource storageMode(String storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  /**
   * storagePool is the ScaleIO Storage Pool associated with the protection domain.
   */
  public ScaleIOPersistentVolumeSource storagePool(String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

  /**
   * system is the name of the storage system as configured in ScaleIO.
   */
  public ScaleIOPersistentVolumeSource system(String system) {
    this.system = system;
    return this;
  }

  /**
   * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
   */
  public ScaleIOPersistentVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }
}
