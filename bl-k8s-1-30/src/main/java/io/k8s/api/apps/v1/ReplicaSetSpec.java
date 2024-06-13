package io.k8s.api.apps.v1;

import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.Long;

/**
 * ReplicaSetSpec is the specification of a ReplicaSet.
 */
public class ReplicaSetSpec {
  public Long minReadySeconds;

  public Long replicas;

  public LabelSelector selector;

  public PodTemplateSpec template;

  /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   */
  public ReplicaSetSpec minReadySeconds(Long minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

  /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   */
  public ReplicaSetSpec replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }

  public ReplicaSetSpec selector(LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  public ReplicaSetSpec template(PodTemplateSpec template) {
    this.template = template;
    return this;
  }
}
