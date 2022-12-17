
package io.k8s.api.core.v1;

import java.util.List;


/**
 * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 * 
 */
public class ISCSIVolumeSource {

    /**
     * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
     * 
     */
    public Boolean chapAuthDiscovery;
    /**
     * chapAuthSession defines whether support iSCSI Session CHAP authentication
     * 
     */
    public Boolean chapAuthSession;
    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
     * 
     */
    public String fsType;
    /**
     * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
     * 
     */
    public String initiatorName;
    /**
     * iqn is the target iSCSI Qualified Name.
     * (Required)
     * 
     */
    public String iqn;
    /**
     * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
     * 
     */
    public String iscsiInterface;
    /**
     * lun represents iSCSI Target Lun number.
     * (Required)
     * 
     */
    public Integer lun;
    /**
     * portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * 
     */
    public List<String> portals;
    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
     * 
     */
    public Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    public LocalObjectReference secretRef;
    /**
     * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * (Required)
     * 
     */
    public String targetPortal;

    public ISCSIVolumeSource withChapAuthDiscovery(Boolean chapAuthDiscovery) {
        this.chapAuthDiscovery = chapAuthDiscovery;
        return this;
    }

    public ISCSIVolumeSource withChapAuthSession(Boolean chapAuthSession) {
        this.chapAuthSession = chapAuthSession;
        return this;
    }

    public ISCSIVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    public ISCSIVolumeSource withInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }

    public ISCSIVolumeSource withIqn(String iqn) {
        this.iqn = iqn;
        return this;
    }

    public ISCSIVolumeSource withIscsiInterface(String iscsiInterface) {
        this.iscsiInterface = iscsiInterface;
        return this;
    }

    public ISCSIVolumeSource withLun(Integer lun) {
        this.lun = lun;
        return this;
    }

    public ISCSIVolumeSource withPortals(List<String> portals) {
        this.portals = portals;
        return this;
    }

    public ISCSIVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public ISCSIVolumeSource withSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public ISCSIVolumeSource withTargetPortal(String targetPortal) {
        this.targetPortal = targetPortal;
        return this;
    }

}
