package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PersistentVolumeStatus is the current status of a persistent volume.
 */
public class PersistentVolumeStatus {
  public String message;

  public String phase;

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
   */
  public PersistentVolumeStatus phase(String phase) {
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
