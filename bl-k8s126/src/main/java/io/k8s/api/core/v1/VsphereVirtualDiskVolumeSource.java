package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Represents a vSphere volume resource.
 */
public class VsphereVirtualDiskVolumeSource {
  public String fsType;

  public String storagePolicyID;

  public String storagePolicyName;

  public String volumePath;

  /**
   * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
   */
  public VsphereVirtualDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
   */
  public VsphereVirtualDiskVolumeSource storagePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return this;
  }

  /**
   * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
   */
  public VsphereVirtualDiskVolumeSource storagePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return this;
  }

  /**
   * volumePath is the path that identifies vSphere volume vmdk
   */
  public VsphereVirtualDiskVolumeSource volumePath(String volumePath) {
    this.volumePath = volumePath;
    return this;
  }

  public static VsphereVirtualDiskVolumeSource vsphereVirtualDiskVolumeSource() {
    return new VsphereVirtualDiskVolumeSource();
  }
}
