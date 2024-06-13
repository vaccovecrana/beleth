package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * Represents a Persistent Disk resource in Google Compute Engine.
 *
 * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
 */
public class GCEPersistentDiskVolumeSource {
  public String fsType;

  public Long partition;

  public String pdName;

  public Boolean readOnly;

  /**
   * fsType is filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   */
  public GCEPersistentDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as &#34;1&#34;. Similarly, the volume partition for /dev/sda is &#34;0&#34; (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   */
  public GCEPersistentDiskVolumeSource partition(Long partition) {
    this.partition = partition;
    return this;
  }

  /**
   * pdName is unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   */
  public GCEPersistentDiskVolumeSource pdName(String pdName) {
    this.pdName = pdName;
    return this;
  }

  /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   */
  public GCEPersistentDiskVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }
}
