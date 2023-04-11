package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Represents a Photon Controller persistent disk resource.
 */
public class PhotonPersistentDiskVolumeSource {
  public String fsType;

  public String pdID;

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
   */
  public PhotonPersistentDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * pdID is the ID that identifies Photon Controller persistent disk
   */
  public PhotonPersistentDiskVolumeSource pdID(String pdID) {
    this.pdID = pdID;
    return this;
  }
}
