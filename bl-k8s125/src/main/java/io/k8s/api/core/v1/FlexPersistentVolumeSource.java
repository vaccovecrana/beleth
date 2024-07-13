package io.k8s.api.core.v1;

import io.k8s.api.core.v1.flexpersistentvolumesource.Options;
import java.lang.Boolean;
import java.lang.String;

/**
 * FlexPersistentVolumeSource represents a generic persistent volume resource that is provisioned/attached using an exec based plugin.
 */
public class FlexPersistentVolumeSource {
  public String driver;

  public String fsType;

  public Options options;

  public Boolean readOnly;

  public SecretReference secretRef;

  /**
   * driver is the name of the driver to use for this volume.
   */
  public FlexPersistentVolumeSource driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * fsType is the Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
   */
  public FlexPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * options is Optional: this field holds extra command options if any.
   */
  public FlexPersistentVolumeSource options(Options options) {
    this.options = options;
    return this;
  }

  /**
   * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public FlexPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public FlexPersistentVolumeSource secretRef(SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  public static FlexPersistentVolumeSource flexPersistentVolumeSource() {
    return new FlexPersistentVolumeSource();
  }
}
