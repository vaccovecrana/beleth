package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.Long;
import java.lang.String;

/**
 * Status is a return value for calls that don&#39;t return other objects.
 */
public class Status {
  public String apiVersion;

  public Long code;

  public StatusDetails details;

  public String kind;

  public String message;

  public ListMeta metadata;

  public String reason;

  public String status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Status apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Suggested HTTP return code for this status, 0 if not set.
   */
  public Status code(Long code) {
    this.code = code;
    return this;
  }

  public Status details(StatusDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Status kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A human-readable description of the status of this operation.
   */
  public Status message(String message) {
    this.message = message;
    return this;
  }

  public Status metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * A machine-readable description of why this operation is in the &#34;Failure&#34; status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
   */
  public Status reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the operation. One of: &#34;Success&#34; or &#34;Failure&#34;. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
   */
  public Status status(String status) {
    this.status = status;
    return this;
  }

  public static Status status() {
    return new Status();
  }
}
