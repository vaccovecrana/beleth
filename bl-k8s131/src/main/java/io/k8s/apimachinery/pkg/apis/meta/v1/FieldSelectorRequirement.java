package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.String;
import java.util.List;

/**
 * FieldSelectorRequirement is a selector that contains values, a key, and an operator that relates the key and values.
 */
public class FieldSelectorRequirement {
  public String key;

  public String operator;

  public List<String> values;

  /**
   * key is the field selector key that the requirement applies to.
   */
  public FieldSelectorRequirement key(String key) {
    this.key = key;
    return this;
  }

  /**
   * operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. The list of operators may grow in the future.
   */
  public FieldSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty.
   */
  public FieldSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  public static FieldSelectorRequirement fieldSelectorRequirement() {
    return new FieldSelectorRequirement();
  }
}
