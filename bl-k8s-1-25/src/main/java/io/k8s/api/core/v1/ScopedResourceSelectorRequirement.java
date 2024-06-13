package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 */
public class ScopedResourceSelectorRequirement {
  public String operator;

  public String scopeName;

  public List<String> values;

  /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
   *
   */
  public ScopedResourceSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The name of the scope that the selector applies to.
   *
   */
  public ScopedResourceSelectorRequirement scopeName(String scopeName) {
    this.scopeName = scopeName;
    return this;
  }

  /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
   */
  public ScopedResourceSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  public static ScopedResourceSelectorRequirement scopedResourceSelectorRequirement() {
    return new ScopedResourceSelectorRequirement();
  }
}
