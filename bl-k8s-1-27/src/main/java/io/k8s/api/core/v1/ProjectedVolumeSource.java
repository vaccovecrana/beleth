package io.k8s.api.core.v1;

import java.lang.Long;
import java.util.List;

/**
 * Represents a projected volume source
 */
public class ProjectedVolumeSource {
  public Long defaultMode;

  public List<VolumeProjection> sources;

  /**
   * defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   */
  public ProjectedVolumeSource defaultMode(Long defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * sources is the list of volume projections
   */
  public ProjectedVolumeSource sources(List<VolumeProjection> sources) {
    this.sources = sources;
    return this;
  }
}
