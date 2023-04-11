package io.k8s.api.batch.v1;

import java.lang.String;
import java.util.List;

/**
 * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven&#39;t been accounted in Job status counters.
 */
public class UncountedTerminatedPods {
  public List<String> failed;

  public List<String> succeeded;

  /**
   * Failed holds UIDs of failed Pods.
   */
  public UncountedTerminatedPods failed(List<String> failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Succeeded holds UIDs of succeeded Pods.
   */
  public UncountedTerminatedPods succeeded(List<String> succeeded) {
    this.succeeded = succeeded;
    return this;
  }
}
