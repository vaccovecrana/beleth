package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.String;

/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 */
public class StatusCause {
  public String field;

  public String message;

  public String reason;

  /**
   * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
   *
   * Examples:
   *   &#34;name&#34; - the field &#34;name&#34; on the current resource
   *   &#34;items[0].name&#34; - the field &#34;name&#34; on the first array entry in &#34;items&#34;
   */
  public StatusCause field(String field) {
    this.field = field;
    return this;
  }

  /**
   * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
   */
  public StatusCause message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A machine-readable description of the cause of the error. If this value is empty there is no information available.
   */
  public StatusCause reason(String reason) {
    this.reason = reason;
    return this;
  }

  public static StatusCause statusCause() {
    return new StatusCause();
  }
}
