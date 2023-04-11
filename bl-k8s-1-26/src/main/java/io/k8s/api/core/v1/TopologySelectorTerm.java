package io.k8s.api.core.v1;

import java.util.List;

/**
 * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
 */
public class TopologySelectorTerm {
  public List<TopologySelectorLabelRequirement> matchLabelExpressions;

  /**
   * A list of topology selector requirements by labels.
   */
  public TopologySelectorTerm matchLabelExpressions(
      List<TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
    return this;
  }
}
