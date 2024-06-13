package io.k8s.api.core.v1;

import io.k8s.api.core.v1.flexvolumesource.Options;
import java.lang.Boolean;
import java.lang.String;

/**
 * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
 */
public class FlexVolumeSource {
  public String driver;

  public String fsType;

  public Options options;

  public Boolean readOnly;

  public LocalObjectReference secretRef;

  /**
   * driver is the name of the driver to use for this volume.
   */
  public FlexVolumeSource driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
   */
  public FlexVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * options is Optional: this field holds extra command options if any.
   */
  public FlexVolumeSource options(Options options) {
    this.options = options;
    return this;
  }

  /**
   * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public FlexVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public FlexVolumeSource secretRef(LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  public static FlexVolumeSource flexVolumeSource() {
    return new FlexVolumeSource();
  }
}
