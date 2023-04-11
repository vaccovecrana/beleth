package io.k8s.apimachinery.pkg.apis.meta.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.labelselector.MatchLabels;
import java.util.List;

/**
 * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
 */
public class LabelSelector {
  public List<LabelSelectorRequirement> matchExpressions;

  public MatchLabels matchLabels;

  /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   */
  public LabelSelector matchExpressions(List<LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is &#34;key&#34;, the operator is &#34;In&#34;, and the values array contains only &#34;value&#34;. The requirements are ANDed.
   */
  public LabelSelector matchLabels(MatchLabels matchLabels) {
    this.matchLabels = matchLabels;
    return this;
  }
}
