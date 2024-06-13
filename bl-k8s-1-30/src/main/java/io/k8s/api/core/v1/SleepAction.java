package io.k8s.api.core.v1;

import java.lang.Long;

/**
 * SleepAction describes a &#34;sleep&#34; action.
 */
public class SleepAction {
  public Long seconds;

  /**
   * Seconds is the number of seconds to sleep.
   */
  public SleepAction seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }

  public static SleepAction sleepAction() {
    return new SleepAction();
  }
}
