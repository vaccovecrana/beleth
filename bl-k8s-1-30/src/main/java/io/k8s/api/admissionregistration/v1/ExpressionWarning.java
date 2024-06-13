package io.k8s.api.admissionregistration.v1;

import java.lang.String;

/**
 * ExpressionWarning is a warning information that targets a specific expression.
 */
public class ExpressionWarning {
  public String fieldRef;

  public String warning;

  /**
   * The path to the field that refers the expression. For example, the reference to the expression of the first item of validations is &#34;spec.validations[0].expression&#34;
   */
  public ExpressionWarning fieldRef(String fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

  /**
   * The content of type checking information in a human-readable form. Each line of the warning contains the type that the expression is checked against, followed by the type check error from the compiler.
   */
  public ExpressionWarning warning(String warning) {
    this.warning = warning;
    return this;
  }
}
