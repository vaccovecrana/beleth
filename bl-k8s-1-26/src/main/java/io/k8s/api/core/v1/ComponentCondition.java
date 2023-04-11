package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Information about the condition of a component.
 */
public class ComponentCondition {
  public String error;

  public String message;

  public String status;

  public String type;

  /**
   * Condition error code for a component. For example, a health check error code.
   */
  public ComponentCondition error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Message about the condition for a component. For example, information about a health check.
   */
  public ComponentCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Status of the condition for a component. Valid values for &#34;Healthy&#34;: &#34;True&#34;, &#34;False&#34;, or &#34;Unknown&#34;.
   */
  public ComponentCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of condition for a component. Valid value: &#34;Healthy&#34;
   */
  public ComponentCondition type(String type) {
    this.type = type;
    return this;
  }
}
