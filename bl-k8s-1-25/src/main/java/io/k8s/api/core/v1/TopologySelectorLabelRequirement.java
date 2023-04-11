package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
 */
public class TopologySelectorLabelRequirement {
  public String key;

  public List<String> values;

  /**
   * The label key that the selector applies to.
   */
  public TopologySelectorLabelRequirement key(String key) {
    this.key = key;
    return this;
  }

  /**
   * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
   */
  public TopologySelectorLabelRequirement values(List<String> values) {
    this.values = values;
    return this;
  }
}
