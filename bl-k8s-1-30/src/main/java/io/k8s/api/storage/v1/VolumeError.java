package io.k8s.api.storage.v1;

import java.lang.String;

/**
 * VolumeError captures an error encountered during a volume operation.
 */
public class VolumeError {
  public String message;

  public String time;

  /**
   * message represents the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
   */
  public VolumeError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public VolumeError time(String time) {
    this.time = time;
    return this;
  }
}
