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
   * API version of the referent
   */
  public CrossVersionObjectReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds&#34;
   */
  public CrossVersionObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
   */
  public CrossVersionObjectReference name(String name) {
    this.name = name;
    return this;
  }

  public static CrossVersionObjectReference crossVersionObjectReference() {
    return new CrossVersionObjectReference();
  }
}
