package io.k8s.api.core.v1;

import java.lang.String;

/**
 * The node this Taint is attached to has the &#34;effect&#34; on any pod that does not tolerate the Taint.
 */
public class Taint {
  public String effect;

  public String key;

  public String timeAdded;

  public String value;

  /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
   *
   */
  public Taint effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Required. The taint key to be applied to a node.
   */
  public Taint key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public Taint timeAdded(String timeAdded) {
    this.timeAdded = timeAdded;
    return this;
  }

  /**
   * The taint value corresponding to the taint key.
   */
  public Taint value(String value) {
    this.value = value;
    return this;
  }

  public static Taint taint() {
    return new Taint();
  }
}
