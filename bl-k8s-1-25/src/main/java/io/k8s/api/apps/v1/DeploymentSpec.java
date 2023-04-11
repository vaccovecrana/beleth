package io.k8s.api.apps.v1;

import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.Boolean;
import java.lang.Long;

/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
public class DeploymentSpec {
  public Long minReadySeconds;

  public Boolean paused;

  public Long progressDeadlineSeconds;

  public Long replicas;

  public Long revisionHistoryLimit;

  public LabelSelector selector;

  public DeploymentStrategy strategy;

  public PodTemplateSpec template;

  /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   */
  public DeploymentSpec minReadySeconds(Long minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

  /**
   * Indicates that the deployment is paused.
   */
  public DeploymentSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

  /**
   * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
   */
  public DeploymentSpec progressDeadlineSeconds(Long progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return this;
  }

  /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
   */
  public DeploymentSpec replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   */
  public DeploymentSpec revisionHistoryLimit(Long revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  public DeploymentSpec selector(LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  public DeploymentSpec strategy(DeploymentStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

  public DeploymentSpec template(PodTemplateSpec template) {
    this.template = template;
    return this;
  }
}
