package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * NetworkPolicy describes what network traffic is allowed for a set of Pods
 */
public class NetworkPolicy {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public NetworkPolicySpec spec;

  public NetworkPolicyStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public NetworkPolicy apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public NetworkPolicy kind(String kind) {
    this.kind = kind;
    return this;
  }

  public NetworkPolicy metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public NetworkPolicy spec(NetworkPolicySpec spec) {
    this.spec = spec;
    return this;
  }

  public NetworkPolicy status(NetworkPolicyStatus status) {
    this.status = status;
    return this;
  }
}
