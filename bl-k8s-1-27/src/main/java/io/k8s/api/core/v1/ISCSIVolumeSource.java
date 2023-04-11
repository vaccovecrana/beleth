package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 */
public class ISCSIVolumeSource {
  public Boolean chapAuthDiscovery;

  public Boolean chapAuthSession;

  public String fsType;

  public String initiatorName;

  public String iqn;

  public String iscsiInterface;

  public Long lun;

  public List<String> portals;

  public Boolean readOnly;

  public LocalObjectReference secretRef;

  public String targetPortal;

  /**
   * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
   */
  public ISCSIVolumeSource chapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
    return this;
  }

  /**
   * chapAuthSession defines whether support iSCSI Session CHAP authentication
   */
  public ISCSIVolumeSource chapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
    return this;
  }

  /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
   */
  public ISCSIVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &#60;target portal&#62;:&#60;volume name&#62; will be created for the connection.
   */
  public ISCSIVolumeSource initiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
    return this;
  }

  /**
   * iqn is the target iSCSI Qualified Name.
   */
  public ISCSIVolumeSource iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }

  /**
   * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
   */
  public ISCSIVolumeSource iscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return this;
  }

  /**
   * lun represents iSCSI Target Lun number.
   */
  public ISCSIVolumeSource lun(Long lun) {
    this.lun = lun;
    return this;
  }

  /**
   * portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   */
  public ISCSIVolumeSource portals(List<String> portals) {
    this.portals = portals;
    return this;
  }

  /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   */
  public ISCSIVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public ISCSIVolumeSource secretRef(LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   */
  public ISCSIVolumeSource targetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
    return this;
  }
}
