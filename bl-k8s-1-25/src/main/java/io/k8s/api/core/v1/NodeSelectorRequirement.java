package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 */
public class NodeSelectorRequirement {
  public String key;

  public String operator;

  public List<String> values;

  /**
   * The label key that the selector applies to.
   */
  public NodeSelectorRequirement key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
   *
   */
  public NodeSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.
   */
  public NodeSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }
}
