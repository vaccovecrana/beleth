package io.k8s.api.core.v1;

import io.k8s.api.core.v1.replicationcontrollerspec.Selector;
import java.lang.Long;

/**
 * ReplicationControllerSpec is the specification of a replication controller.
 */
public class ReplicationControllerSpec {
  public Long minReadySeconds;

  public Long replicas;

  public Selector selector;

  public PodTemplateSpec template;

  /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   */
  public ReplicationControllerSpec minReadySeconds(Long minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

  /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
   */
  public ReplicationControllerSpec replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   */
  public ReplicationControllerSpec selector(Selector selector) {
    this.selector = selector;
    return this;
  }

  public ReplicationControllerSpec template(PodTemplateSpec template) {
    this.template = template;
    return this;
  }

  public static ReplicationControllerSpec replicationControllerSpec() {
    return new ReplicationControllerSpec();
  }
}
