package io.k8s.api.core.v1;

import java.util.List;

/**
 * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
 */
public class ScopeSelector {
  public List<ScopedResourceSelectorRequirement> matchExpressions;

  /**
   * A list of scope selector requirements by scope of the resources.
   */
  public ScopeSelector matchExpressions(List<ScopedResourceSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public static ScopeSelector scopeSelector() {
    return new ScopeSelector();
  }
}
