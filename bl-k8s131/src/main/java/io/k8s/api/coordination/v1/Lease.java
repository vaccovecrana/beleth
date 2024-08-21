package io.k8s.api.coordination.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Lease defines a lease concept.
 */
public class Lease {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public LeaseSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Lease apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Lease kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Lease metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Lease spec(LeaseSpec spec) {
    this.spec = spec;
    return this;
  }

  public static Lease lease() {
    return new Lease();
  }
}
