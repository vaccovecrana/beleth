package io.k8s.api.core.v1;

import java.lang.String;

/**
 * NodeConfigStatus describes the status of the config assigned by Node.Spec.ConfigSource.
 */
public class NodeConfigStatus {
  public NodeConfigSource active;

  public NodeConfigSource assigned;

  public String error;

  public NodeConfigSource lastKnownGood;

  public NodeConfigStatus active(NodeConfigSource active) {
    this.active = active;
    return this;
  }

  public NodeConfigStatus assigned(NodeConfigSource assigned) {
    this.assigned = assigned;
    return this;
  }

  /**
   * Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not Error is empty, but should not rely on the stability of the Error text across Kubelet versions.
   */
  public NodeConfigStatus error(String error) {
    this.error = error;
    return this;
  }

  public NodeConfigStatus lastKnownGood(NodeConfigSource lastKnownGood) {
    this.lastKnownGood = lastKnownGood;
    return this;
  }

  public static NodeConfigStatus nodeConfigStatus() {
    return new NodeConfigStatus();
  }
}
