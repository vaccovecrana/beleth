package io.k8s.api.admissionregistration.v1alpha1;

import java.util.List;

/**
 * TypeChecking contains results of type checking the expressions in the ValidatingAdmissionPolicy
 */
public class TypeChecking {
  public List<ExpressionWarning> expressionWarnings;

  /**
   * The type checking warnings for each expression.
   */
  public TypeChecking expressionWarnings(List<ExpressionWarning> expressionWarnings) {
    this.expressionWarnings = expressionWarnings;
    return this;
  }
}
