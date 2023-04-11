package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * DaemonSet represents the configuration of a daemon set.
 */
public class DaemonSet {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public DaemonSetSpec spec;

  public DaemonSetStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public DaemonSet apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public DaemonSet kind(String kind) {
    this.kind = kind;
    return this;
  }

  public DaemonSet metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public DaemonSet spec(DaemonSetSpec spec) {
    this.spec = spec;
    return this;
  }

  public DaemonSet status(DaemonSetStatus status) {
    this.status = status;
    return this;
  }
}
