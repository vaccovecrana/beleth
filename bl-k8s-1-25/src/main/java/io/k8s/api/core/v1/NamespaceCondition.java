package io.k8s.api.core.v1;

import java.lang.String;

/**
 * NamespaceCondition contains details about state of namespace.
 */
public class NamespaceCondition {
  public String lastTransitionTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public NamespaceCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  public NamespaceCondition message(String message) {
    this.message = message;
    return this;
  }

  public NamespaceCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public NamespaceCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of namespace controller condition.
   */
  public NamespaceCondition type(String type) {
    this.type = type;
    return this;
  }
}
