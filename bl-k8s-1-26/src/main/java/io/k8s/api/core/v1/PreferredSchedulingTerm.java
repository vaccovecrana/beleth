package io.k8s.api.core.v1;

import java.lang.Long;

/**
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it&#39;s a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 */
public class PreferredSchedulingTerm {
  public NodeSelectorTerm preference;

  public Long weight;

  public PreferredSchedulingTerm preference(NodeSelectorTerm preference) {
    this.preference = preference;
    return this;
  }

  /**
   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
   */
  public PreferredSchedulingTerm weight(Long weight) {
    this.weight = weight;
    return this;
  }
}
