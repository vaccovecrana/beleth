package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 */
public class AzureDiskVolumeSource {
  public String cachingMode;

  public String diskName;

  public String diskURI;

  public String fsType;

  public String kind;

  public Boolean readOnly;

  /**
   * cachingMode is the Host Caching mode: None, Read Only, Read Write.
   */
  public AzureDiskVolumeSource cachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
    return this;
  }

  /**
   * diskName is the Name of the data disk in the blob storage
   */
  public AzureDiskVolumeSource diskName(String diskName) {
    this.diskName = diskName;
    return this;
  }

  /**
   * diskURI is the URI of data disk in the blob storage
   */
  public AzureDiskVolumeSource diskURI(String diskURI) {
    this.diskURI = diskURI;
    return this;
  }

  /**
   * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
   */
  public AzureDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
   */
  public AzureDiskVolumeSource kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public AzureDiskVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public static AzureDiskVolumeSource azureDiskVolumeSource() {
    return new AzureDiskVolumeSource();
  }
}
