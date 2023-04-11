package io.k8s.api.core.v1;

import io.k8s.api.core.v1.namespacestatus.Phase;
import java.util.List;

/**
 * NamespaceStatus is information about the current status of a Namespace.
 */
public class NamespaceStatus {
  public List<NamespaceCondition> conditions;

  public Phase phase;

  /**
   * Represents the latest available observations of a namespace&#39;s current state.
   */
  public NamespaceStatus conditions(List<NamespaceCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   *
   * Possible enum values:
   *  - `&#34;Active&#34;` means the namespace is available for use in the system
   *  - `&#34;Terminating&#34;` means the namespace is undergoing graceful termination
   */
  public NamespaceStatus phase(Phase phase) {
    this.phase = phase;
    return this;
  }
}
