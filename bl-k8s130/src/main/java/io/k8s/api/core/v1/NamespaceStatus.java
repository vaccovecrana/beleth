package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * NamespaceStatus is information about the current status of a Namespace.
 */
public class NamespaceStatus {
  public List<NamespaceCondition> conditions;

  public String phase;

  /**
   * Represents the latest available observations of a namespace&#39;s current state.
   */
  public NamespaceStatus conditions(List<NamespaceCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   */
  public NamespaceStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

  public static NamespaceStatus namespaceStatus() {
    return new NamespaceStatus();
  }
}
