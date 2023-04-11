package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 */
public class ISCSIPersistentVolumeSource {
  public Boolean chapAuthDiscovery;

  public Boolean chapAuthSession;

  public String fsType;

  public String initiatorName;

  public String iqn;

  public String iscsiInterface;

  public Long lun;

  public List<String> portals;

  public Boolean readOnly;

  public SecretReference secretRef;

  public String targetPortal;

  /**
   * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
   */
  public ISCSIPersistentVolumeSource chapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
    return this;
  }

  /**
   * chapAuthSession defines whether support iSCSI Session CHAP authentication
   */
  public ISCSIPersistentVolumeSource chapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
    return this;
  }

  /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
   */
  public ISCSIPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &#60;target portal&#62;:&#60;volume name&#62; will be created for the connection.
   */
  public ISCSIPersistentVolumeSource initiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
    return this;
  }

  /**
   * iqn is Target iSCSI Qualified Name.
   */
  public ISCSIPersistentVolumeSource iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }

  /**
   * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
   */
  public ISCSIPersistentVolumeSource iscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return this;
  }

  /**
   * lun is iSCSI Target Lun number.
   */
  public ISCSIPersistentVolumeSource lun(Long lun) {
    this.lun = lun;
    return this;
  }

  /**
   * portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   */
  public ISCSIPersistentVolumeSource portals(List<String> portals) {
    this.portals = portals;
    return this;
  }

  /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   */
  public ISCSIPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public ISCSIPersistentVolumeSource secretRef(SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   */
  public ISCSIPersistentVolumeSource targetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
    return this;
  }
}
