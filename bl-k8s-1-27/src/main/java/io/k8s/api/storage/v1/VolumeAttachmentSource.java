package io.k8s.api.storage.v1;

import io.k8s.api.core.v1.PersistentVolumeSpec;
import java.lang.String;

/**
 * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 */
public class VolumeAttachmentSource {
  public PersistentVolumeSpec inlineVolumeSpec;

  public String persistentVolumeName;

  public VolumeAttachmentSource inlineVolumeSpec(PersistentVolumeSpec inlineVolumeSpec) {
    this.inlineVolumeSpec = inlineVolumeSpec;
    return this;
  }

  /**
   * persistentVolumeName represents the name of the persistent volume to attach.
   */
  public VolumeAttachmentSource persistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
    return this;
  }
}
