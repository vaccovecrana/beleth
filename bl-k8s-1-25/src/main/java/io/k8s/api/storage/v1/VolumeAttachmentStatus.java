
package io.k8s.api.storage.v1;



/**
 * VolumeAttachmentStatus is the status of a VolumeAttachment request.
 * 
 */
public class VolumeAttachmentStatus {

    /**
     * VolumeError captures an error encountered during a volume operation.
     * 
     */
    public VolumeError attachError;
    /**
     * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * (Required)
     * 
     */
    public Boolean attached;
    /**
     * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    public AttachmentMetadata attachmentMetadata;
    /**
     * VolumeError captures an error encountered during a volume operation.
     * 
     */
    public VolumeError detachError;

    public VolumeAttachmentStatus withAttachError(VolumeError attachError) {
        this.attachError = attachError;
        return this;
    }

    public VolumeAttachmentStatus withAttached(Boolean attached) {
        this.attached = attached;
        return this;
    }

    public VolumeAttachmentStatus withAttachmentMetadata(AttachmentMetadata attachmentMetadata) {
        this.attachmentMetadata = attachmentMetadata;
        return this;
    }

    public VolumeAttachmentStatus withDetachError(VolumeError detachError) {
        this.detachError = detachError;
        return this;
    }

}
