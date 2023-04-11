package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * NamespaceSpec describes the attributes on a Namespace.
 */
public class NamespaceSpec {
  public List<String> finalizers;

  /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   */
  public NamespaceSpec finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }
}
