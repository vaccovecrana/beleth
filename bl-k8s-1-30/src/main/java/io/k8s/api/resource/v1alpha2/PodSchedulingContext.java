package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * PodSchedulingContext objects hold information that is needed to schedule a Pod with ResourceClaims that use &#34;WaitForFirstConsumer&#34; allocation mode.
 *
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
public class PodSchedulingContext {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public PodSchedulingContextSpec spec;

  public PodSchedulingContextStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PodSchedulingContext apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PodSchedulingContext kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PodSchedulingContext metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public PodSchedulingContext spec(PodSchedulingContextSpec spec) {
    this.spec = spec;
    return this;
  }

  public PodSchedulingContext status(PodSchedulingContextStatus status) {
    this.status = status;
    return this;
  }
}
