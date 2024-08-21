package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ReplicationController represents the configuration of a replication controller.
 */
public class ReplicationController {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ReplicationControllerSpec spec;

  public ReplicationControllerStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ReplicationController apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ReplicationController kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ReplicationController metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ReplicationController spec(ReplicationControllerSpec spec) {
    this.spec = spec;
    return this;
  }

  public ReplicationController status(ReplicationControllerStatus status) {
    this.status = status;
    return this;
  }

  public static ReplicationController replicationController() {
    return new ReplicationController();
  }
}
