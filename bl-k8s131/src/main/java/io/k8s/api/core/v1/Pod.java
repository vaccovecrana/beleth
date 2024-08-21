package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Pod is a collection of containers that can run on a host. This resource is created by clients and scheduled onto hosts.
 */
public class Pod {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public PodSpec spec;

  public PodStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Pod apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Pod kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Pod metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Pod spec(PodSpec spec) {
    this.spec = spec;
    return this;
  }

  public Pod status(PodStatus status) {
    this.status = status;
    return this;
  }

  public static Pod pod() {
    return new Pod();
  }
}
