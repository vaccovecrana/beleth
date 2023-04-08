
package io.k8s.api.storage.v1;

import io.k8s.api.core.v1.PersistentVolumeSpec;


/**
 * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 * 
 */
public class VolumeAttachmentSource {

    /**
     * PersistentVolumeSpec is the specification of a persistent volume.
     * 
     */
    public PersistentVolumeSpec inlineVolumeSpec;
    /**
     * Name of the persistent volume to attach.
     * 
     */
    public String persistentVolumeName;

    public VolumeAttachmentSource withInlineVolumeSpec(PersistentVolumeSpec inlineVolumeSpec) {
        this.inlineVolumeSpec = inlineVolumeSpec;
        return this;
    }

    public VolumeAttachmentSource withPersistentVolumeName(String persistentVolumeName) {
        this.persistentVolumeName = persistentVolumeName;
        return this;
    }

}
