package io.k8s.api.storage.v1;

import io.k8s.api.storage.v1.volumeattachmentstatus.AttachmentMetadata;
import java.lang.Boolean;

/**
 * VolumeAttachmentStatus is the status of a VolumeAttachment request.
 */
public class VolumeAttachmentStatus {
  public VolumeError attachError;

  public Boolean attached;

  public AttachmentMetadata attachmentMetadata;

  public VolumeError detachError;

  public VolumeAttachmentStatus attachError(VolumeError attachError) {
    this.attachError = attachError;
    return this;
  }

  /**
   * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   */
  public VolumeAttachmentStatus attached(Boolean attached) {
    this.attached = attached;
    return this;
  }

  /**
   * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   */
  public VolumeAttachmentStatus attachmentMetadata(AttachmentMetadata attachmentMetadata) {
    this.attachmentMetadata = attachmentMetadata;
    return this;
  }

  public VolumeAttachmentStatus detachError(VolumeError detachError) {
    this.detachError = detachError;
    return this;
  }
}
