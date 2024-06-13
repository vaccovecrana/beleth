package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * ResourceClaimParameters defines resource requests for a ResourceClaim in an in-tree format understood by Kubernetes.
 */
public class ResourceClaimParameters {
  public String apiVersion;

  public List<DriverRequests> driverRequests;

  public ResourceClaimParametersReference generatedFrom;

  public String kind;

  public ObjectMeta metadata;

  public Boolean shareable;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ResourceClaimParameters apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.
   *
   * May be empty, in which case the claim can always be allocated.
   */
  public ResourceClaimParameters driverRequests(List<DriverRequests> driverRequests) {
    this.driverRequests = driverRequests;
    return this;
  }

  public ResourceClaimParameters generatedFrom(ResourceClaimParametersReference generatedFrom) {
    this.generatedFrom = generatedFrom;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ResourceClaimParameters kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ResourceClaimParameters metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time.
   */
  public ResourceClaimParameters shareable(Boolean shareable) {
    this.shareable = shareable;
    return this;
  }
}
