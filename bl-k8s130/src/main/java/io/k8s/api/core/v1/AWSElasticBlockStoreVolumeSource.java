package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * Represents a Persistent Disk resource in AWS.
 *
 * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
 */
public class AWSElasticBlockStoreVolumeSource {
  public String fsType;

  public Long partition;

  public Boolean readOnly;

  public String volumeID;

  /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   */
  public AWSElasticBlockStoreVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as &#34;1&#34;. Similarly, the volume partition for /dev/sda is &#34;0&#34; (or you can leave the property empty).
   */
  public AWSElasticBlockStoreVolumeSource partition(Long partition) {
    this.partition = partition;
    return this;
  }

  /**
   * readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   */
  public AWSElasticBlockStoreVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   */
  public AWSElasticBlockStoreVolumeSource volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }

  public static AWSElasticBlockStoreVolumeSource aWSElasticBlockStoreVolumeSource() {
    return new AWSElasticBlockStoreVolumeSource();
  }
}
