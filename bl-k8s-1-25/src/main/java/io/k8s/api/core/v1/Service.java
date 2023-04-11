package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Service is a named abstraction of software service (for example, mysql) consisting of local port (for example 3306) that the proxy listens on, and the selector that determines which pods will answer requests sent through the proxy.
 */
public class Service {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ServiceSpec spec;

  public ServiceStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Service apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Service kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Service metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Service spec(ServiceSpec spec) {
    this.spec = spec;
    return this;
  }

  public Service status(ServiceStatus status) {
    this.status = status;
    return this;
  }
}
