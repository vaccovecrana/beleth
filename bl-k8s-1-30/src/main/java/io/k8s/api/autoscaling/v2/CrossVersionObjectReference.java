package io.k8s.api.autoscaling.v2;

import java.lang.String;

/**
 * CrossVersionObjectReference contains enough information to let you identify the referred resource.
 */
public class CrossVersionObjectReference {
  public String apiVersion;

  public String kind;

  public String name;

  /**
   * apiVersion is the API version of the referent
   */
  public CrossVersionObjectReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * kind is the kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public CrossVersionObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * name is the name of the referent; More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public CrossVersionObjectReference name(String name) {
    this.name = name;
    return this;
  }
}
