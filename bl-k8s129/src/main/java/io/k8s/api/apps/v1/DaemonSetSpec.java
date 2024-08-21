package io.k8s.api.apps.v1;

import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.Long;

/**
 * DaemonSetSpec is the specification of a daemon set.
 */
public class DaemonSetSpec {
  public Long minReadySeconds;

  public Long revisionHistoryLimit;

  public LabelSelector selector;

  public PodTemplateSpec template;

  public DaemonSetUpdateStrategy updateStrategy;

  /**
   * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
   */
  public DaemonSetSpec minReadySeconds(Long minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

  /**
   * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   */
  public DaemonSetSpec revisionHistoryLimit(Long revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  public DaemonSetSpec selector(LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  public DaemonSetSpec template(PodTemplateSpec template) {
    this.template = template;
    return this;
  }

  public DaemonSetSpec updateStrategy(DaemonSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

  public static DaemonSetSpec daemonSetSpec() {
    return new DaemonSetSpec();
  }
}
