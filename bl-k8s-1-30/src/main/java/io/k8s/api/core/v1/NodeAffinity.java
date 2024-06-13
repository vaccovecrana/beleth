package io.k8s.api.core.v1;

import java.util.List;

/**
 * Node affinity is a group of node affinity scheduling rules.
 */
public class NodeAffinity {
  public List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;

  public NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

  /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding &#34;weight&#34; to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
   */
  public NodeAffinity preferredDuringSchedulingIgnoredDuringExecution(
      List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public NodeAffinity requiredDuringSchedulingIgnoredDuringExecution(
      NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }
}
