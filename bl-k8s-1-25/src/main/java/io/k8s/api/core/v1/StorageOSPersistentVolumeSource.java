package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * Represents a StorageOS persistent volume resource.
 */
public class StorageOSPersistentVolumeSource {
  public String fsType;

  public Boolean readOnly;

  public ObjectReference secretRef;

  public String volumeName;

  public String volumeNamespace;

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
   */
  public StorageOSPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public StorageOSPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public StorageOSPersistentVolumeSource secretRef(ObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
   */
  public StorageOSPersistentVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to &#34;default&#34; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
   */
  public StorageOSPersistentVolumeSource volumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return this;
  }

  public static StorageOSPersistentVolumeSource storageOSPersistentVolumeSource() {
    return new StorageOSPersistentVolumeSource();
  }
}
