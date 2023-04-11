package io.k8s.api.core.v1;

import io.k8s.api.core.v1.scopedresourceselectorrequirement.Operator;
import io.k8s.api.core.v1.scopedresourceselectorrequirement.ScopeName;
import java.lang.String;
import java.util.List;

/**
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 */
public class ScopedResourceSelectorRequirement {
  public Operator operator;

  public ScopeName scopeName;

  public List<String> values;

  /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
   *
   * Possible enum values:
   *  - `&#34;DoesNotExist&#34;`
   *  - `&#34;Exists&#34;`
   *  - `&#34;In&#34;`
   *  - `&#34;NotIn&#34;`
   */
  public ScopedResourceSelectorRequirement operator(Operator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The name of the scope that the selector applies to.
   *
   * Possible enum values:
   *  - `&#34;BestEffort&#34;` Match all pod objects that have best effort quality of service
   *  - `&#34;CrossNamespacePodAffinity&#34;` Match all pod objects that have cross-namespace pod (anti)affinity mentioned.
   *  - `&#34;NotBestEffort&#34;` Match all pod objects that do not have best effort quality of service
   *  - `&#34;NotTerminating&#34;` Match all pod objects where spec.activeDeadlineSeconds is nil
   *  - `&#34;PriorityClass&#34;` Match all pod objects that have priority class mentioned
   *  - `&#34;Terminating&#34;` Match all pod objects where spec.activeDeadlineSeconds &#62;=0
   */
  public ScopedResourceSelectorRequirement scopeName(ScopeName scopeName) {
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
}
