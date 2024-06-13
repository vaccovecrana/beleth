package io.k8s.api.batch.v1;

import java.lang.String;
import java.util.List;

/**
 * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of onExitCodes and onPodConditions, but not both, can be used in each rule.
 */
public class PodFailurePolicyRule {
  public String action;

  public PodFailurePolicyOnExitCodesRequirement onExitCodes;

  public List<PodFailurePolicyOnPodConditionsPattern> onPodConditions;

  /**
   * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:
   *
   * - FailJob: indicates that the pod&#39;s job is marked as Failed and all
   *   running pods are terminated.
   * - FailIndex: indicates that the pod&#39;s index is marked as Failed and will
   *   not be restarted.
   *   This value is beta-level. It can be used when the
   *   `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
   * - Ignore: indicates that the counter towards the .backoffLimit is not
   *   incremented and a replacement pod is created.
   * - Count: indicates that the pod is handled in the default way - the
   *   counter towards the .backoffLimit is incremented.
   * Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
   */
  public PodFailurePolicyRule action(String action) {
    this.action = action;
    return this;
  }

  public PodFailurePolicyRule onExitCodes(PodFailurePolicyOnExitCodesRequirement onExitCodes) {
    this.onExitCodes = onExitCodes;
    return this;
  }

  /**
   * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
   */
  public PodFailurePolicyRule onPodConditions(
      List<PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
    this.onPodConditions = onPodConditions;
    return this;
  }
}
