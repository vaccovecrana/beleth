package io.k8s.api.storage.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
 *
 * VolumeAttachment objects are non-namespaced.
 */
public class VolumeAttachment {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public VolumeAttachmentSpec spec;

  public VolumeAttachmentStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public VolumeAttachment apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public VolumeAttachment kind(String kind) {
    this.kind = kind;
    return this;
  }

  public VolumeAttachment metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public VolumeAttachment spec(VolumeAttachmentSpec spec) {
    this.spec = spec;
    return this;
  }

  public VolumeAttachment status(VolumeAttachmentStatus status) {
    this.status = status;
    return this;
  }
}
