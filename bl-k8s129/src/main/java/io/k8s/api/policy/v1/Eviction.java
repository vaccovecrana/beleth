package io.k8s.api.policy.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.DeleteOptions;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Eviction evicts a pod from its node subject to certain policies and safety constraints. This is a subresource of Pod.  A request to cause such an eviction is created by POSTing to .../pods/&#60;pod name&#62;/evictions.
 */
public class Eviction {
  public String apiVersion;

  public DeleteOptions deleteOptions;

  public String kind;

  public ObjectMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Eviction apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  public Eviction deleteOptions(DeleteOptions deleteOptions) {
    this.deleteOptions = deleteOptions;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Eviction kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Eviction metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static Eviction eviction() {
    return new Eviction();
  }
}
