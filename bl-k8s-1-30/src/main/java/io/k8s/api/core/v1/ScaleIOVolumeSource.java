package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 */
public class ScaleIOVolumeSource {
  public String fsType;

  public String gateway;

  public String protectionDomain;

  public Boolean readOnly;

  public LocalObjectReference secretRef;

  public Boolean sslEnabled;

  public String storageMode;

  public String storagePool;

  public String system;

  public String volumeName;

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Default is &#34;xfs&#34;.
   */
  public ScaleIOVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * gateway is the host address of the ScaleIO API Gateway.
   */
  public ScaleIOVolumeSource gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
   */
  public ScaleIOVolumeSource protectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return this;
  }

  /**
   * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public ScaleIOVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public ScaleIOVolumeSource secretRef(LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * sslEnabled Flag enable/disable SSL communication with Gateway, default false
   */
  public ScaleIOVolumeSource sslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

  /**
   * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
   */
  public ScaleIOVolumeSource storageMode(String storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  /**
   * storagePool is the ScaleIO Storage Pool associated with the protection domain.
   */
  public ScaleIOVolumeSource storagePool(String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

  /**
   * system is the name of the storage system as configured in ScaleIO.
   */
  public ScaleIOVolumeSource system(String system) {
    this.system = system;
    return this;
  }

  /**
   * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
   */
  public ScaleIOVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }
}
