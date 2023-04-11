package io.k8s.api.core.v1;

import io.k8s.api.core.v1.taint.Effect;
import java.lang.String;

/**
 * The node this Taint is attached to has the &#34;effect&#34; on any pod that does not tolerate the Taint.
 */
public class Taint {
  public Effect effect;

  public String key;

  public String timeAdded;

  public String value;

  /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
   *
   * Possible enum values:
   *  - `&#34;NoExecute&#34;` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
   *  - `&#34;NoSchedule&#34;` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
   *  - `&#34;PreferNoSchedule&#34;` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
   */
  public Taint effect(Effect effect) {
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
}
