package io.k8s.api.core.v1;

import io.k8s.api.core.v1.persistentvolumestatus.Phase;
import java.lang.String;

/**
 * PersistentVolumeStatus is the current status of a persistent volume.
 */
public class PersistentVolumeStatus {
  public String message;

  public Phase phase;

  public String reason;

  /**
   * message is a human-readable message indicating details about why the volume is in this state.
   */
  public PersistentVolumeStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
   *
   * Possible enum values:
   *  - `&#34;Available&#34;` used for PersistentVolumes that are not yet bound Available volumes are held by the binder and matched to PersistentVolumeClaims
   *  - `&#34;Bound&#34;` used for PersistentVolumes that are bound
   *  - `&#34;Failed&#34;` used for PersistentVolumes that failed to be correctly recycled or deleted after being released from a claim
   *  - `&#34;Pending&#34;` used for PersistentVolumes that are not available
   *  - `&#34;Released&#34;` used for PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes must be recycled before becoming available again this phase is used by the persistent volume claim binder to signal to another process to reclaim the resource
   */
  public PersistentVolumeStatus phase(Phase phase) {
    this.phase = phase;
    return this;
  }

  /**
   * reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
   */
  public PersistentVolumeStatus reason(String reason) {
    this.reason = reason;
    return this;
  }
}
