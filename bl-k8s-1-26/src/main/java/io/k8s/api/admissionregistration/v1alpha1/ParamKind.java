package io.k8s.api.admissionregistration.v1alpha1;

import java.lang.String;

/**
 * ParamKind is a tuple of Group Kind and Version.
 */
public class ParamKind {
  public String apiVersion;

  public String kind;

  /**
   * APIVersion is the API group version the resources belong to. In format of &#34;group/version&#34;. Required.
   */
  public ParamKind apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is the API kind the resources belong to. Required.
   */
  public ParamKind kind(String kind) {
    this.kind = kind;
    return this;
  }
}
