
package io.k8s.api.storage.v1;



/**
 * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
 * 
 */
public class VolumeAttachmentSpec {

    /**
     * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * (Required)
     * 
     */
    public String attacher;
    /**
     * The node that the volume should be attached to.
     * (Required)
     * 
     */
    public String nodeName;
    /**
     * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
     * (Required)
     * 
     */
    public VolumeAttachmentSource source;

    public VolumeAttachmentSpec withAttacher(String attacher) {
        this.attacher = attacher;
        return this;
    }

    public VolumeAttachmentSpec withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public VolumeAttachmentSpec withSource(VolumeAttachmentSource source) {
        this.source = source;
        return this;
    }

}
