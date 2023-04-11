package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.String;
import java.util.List;

/**
 * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 */
public class LabelSelectorRequirement {
  public String key;

  public String operator;

  public List<String> values;

  /**
   * key is the label key that the selector applies to.
   */
  public LabelSelectorRequirement key(String key) {
    this.key = key;
    return this;
  }

  /**
   * operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
   */
  public LabelSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
   */
  public LabelSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }
}
