package io.k8s.api.apps.v1;

import io.k8s.api.apps.v1.statefulsetspec.PodManagementPolicy;
import io.k8s.api.core.v1.PersistentVolumeClaim;
import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 */
public class StatefulSetSpec {
  public Long minReadySeconds;

  public StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy;

  public PodManagementPolicy podManagementPolicy;

  public Long replicas;

  public Long revisionHistoryLimit;

  public LabelSelector selector;

  public String serviceName;

  public PodTemplateSpec template;

  public StatefulSetUpdateStrategy updateStrategy;

  public List<PersistentVolumeClaim> volumeClaimTemplates;

  /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   */
  public StatefulSetSpec minReadySeconds(Long minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

  public StatefulSetSpec persistentVolumeClaimRetentionPolicy(
      StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
    this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
    return this;
  }

  /**
   * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
   *
   * Possible enum values:
   *  - `&#34;OrderedReady&#34;` will create pods in strictly increasing order on scale up and strictly decreasing order on scale down, progressing only when the previous pod is ready or terminated. At most one pod will be changed at any time.
   *  - `&#34;Parallel&#34;` will create and delete pods as soon as the stateful set replica count is changed, and will not wait for pods to be ready or complete termination.
   */
  public StatefulSetSpec podManagementPolicy(PodManagementPolicy podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
    return this;
  }

  /**
   * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
   */
  public StatefulSetSpec replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
   */
  public StatefulSetSpec revisionHistoryLimit(Long revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  public StatefulSetSpec selector(LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
   */
  public StatefulSetSpec serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  public StatefulSetSpec template(PodTemplateSpec template) {
    this.template = template;
    return this;
  }

  public StatefulSetSpec updateStrategy(StatefulSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

  /**
   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
   */
  public StatefulSetSpec volumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }
}
