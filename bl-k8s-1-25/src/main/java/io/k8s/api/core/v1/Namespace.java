package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Namespace provides a scope for Names. Use of multiple namespaces is optional.
 */
public class Namespace {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public NamespaceSpec spec;

  public NamespaceStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Namespace apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Namespace kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Namespace metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Namespace spec(NamespaceSpec spec) {
    this.spec = spec;
    return this;
  }

  public Namespace status(NamespaceStatus status) {
    this.status = status;
    return this;
  }

  public static Namespace namespace() {
    return new Namespace();
  }
}
