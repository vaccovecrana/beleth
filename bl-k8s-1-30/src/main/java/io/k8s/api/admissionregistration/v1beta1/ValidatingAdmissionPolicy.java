package io.k8s.api.admissionregistration.v1beta1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ValidatingAdmissionPolicy describes the definition of an admission validation policy that accepts or rejects an object without changing it.
 */
public class ValidatingAdmissionPolicy {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ValidatingAdmissionPolicySpec spec;

  public ValidatingAdmissionPolicyStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ValidatingAdmissionPolicy apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ValidatingAdmissionPolicy kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ValidatingAdmissionPolicy metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ValidatingAdmissionPolicy spec(ValidatingAdmissionPolicySpec spec) {
    this.spec = spec;
    return this;
  }

  public ValidatingAdmissionPolicy status(ValidatingAdmissionPolicyStatus status) {
    this.status = status;
    return this;
  }
}
