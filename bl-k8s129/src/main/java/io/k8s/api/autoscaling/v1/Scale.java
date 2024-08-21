package io.k8s.api.autoscaling.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Scale represents a scaling request for a resource.
 */
public class Scale {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ScaleSpec spec;

  public ScaleStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Scale apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Scale kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Scale metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Scale spec(ScaleSpec spec) {
    this.spec = spec;
    return this;
  }

  public Scale status(ScaleStatus status) {
    this.status = status;
    return this;
  }

  public static Scale scale() {
    return new Scale();
  }
}
