package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import io.k8s.apimachinery.pkg.runtime.RawExtension;
import java.lang.Long;
import java.lang.String;

/**
 * ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
 */
public class ControllerRevision {
  public String apiVersion;

  public RawExtension data;

  public String kind;

  public ObjectMeta metadata;

  public Long revision;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ControllerRevision apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  public ControllerRevision data(RawExtension data) {
    this.data = data;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ControllerRevision kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ControllerRevision metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Revision indicates the revision of the state represented by Data.
   */
  public ControllerRevision revision(Long revision) {
    this.revision = revision;
    return this;
  }

  public static ControllerRevision controllerRevision() {
    return new ControllerRevision();
  }
}
