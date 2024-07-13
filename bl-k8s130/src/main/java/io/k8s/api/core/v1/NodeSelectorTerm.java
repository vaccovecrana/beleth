package io.k8s.api.core.v1;

import java.util.List;

/**
 * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 */
public class NodeSelectorTerm {
  public List<NodeSelectorRequirement> matchExpressions;

  public List<NodeSelectorRequirement> matchFields;

  /**
   * A list of node selector requirements by node&#39;s labels.
   */
  public NodeSelectorTerm matchExpressions(List<NodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  /**
   * A list of node selector requirements by node&#39;s fields.
   */
  public NodeSelectorTerm matchFields(List<NodeSelectorRequirement> matchFields) {
    this.matchFields = matchFields;
    return this;
  }

  public static NodeSelectorTerm nodeSelectorTerm() {
    return new NodeSelectorTerm();
  }
}
