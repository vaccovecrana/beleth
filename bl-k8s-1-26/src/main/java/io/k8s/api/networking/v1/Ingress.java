package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
 */
public class Ingress {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public IngressSpec spec;

  public IngressStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Ingress apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Ingress kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Ingress metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Ingress spec(IngressSpec spec) {
    this.spec = spec;
    return this;
  }

  public Ingress status(IngressStatus status) {
    this.status = status;
    return this;
  }
}
