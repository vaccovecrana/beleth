package io.k8s.api.admissionregistration.v1beta1;

import java.lang.String;

/**
 * Variable is the definition of a variable that is used for composition. A variable is defined as a named expression.
 */
public class Variable {
  public String expression;

  public String name;

  /**
   * Expression is the expression that will be evaluated as the value of the variable. The CEL expression has access to the same identifiers as the CEL expressions in Validation.
   */
  public Variable expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Name is the name of the variable. The name must be a valid CEL identifier and unique among all variables. The variable can be accessed in other expressions through `variables` For example, if name is &#34;foo&#34;, the variable will be available as `variables.foo`
   */
  public Variable name(String name) {
    this.name = name;
    return this;
  }
}
