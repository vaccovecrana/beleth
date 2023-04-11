package io.k8s.api.storage.v1;

import java.lang.String;

/**
 * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
 */
public class VolumeAttachmentSpec {
  public String attacher;

  public String nodeName;

  public VolumeAttachmentSource source;

  /**
   * attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
   */
  public VolumeAttachmentSpec attacher(String attacher) {
    this.attacher = attacher;
    return this;
  }

  /**
   * nodeName represents the node that the volume should be attached to.
   */
  public VolumeAttachmentSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  public VolumeAttachmentSpec source(VolumeAttachmentSource source) {
    this.source = source;
    return this;
  }
}
