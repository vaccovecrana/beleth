package io.k8s.api.core.v1;

import io.k8s.api.core.v1.toleration.Effect;
import io.k8s.api.core.v1.toleration.Operator;
import java.lang.Long;
import java.lang.String;

/**
 * The pod this Toleration is attached to tolerates any taint that matches the triple &#60;key,value,effect&#62; using the matching operator &#60;operator&#62;.
 */
public class Toleration {
  public Effect effect;

  public String key;

  public Operator operator;

  public Long tolerationSeconds;

  public String value;

  /**
   * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
   *
   * Possible enum values:
   *  - `&#34;NoExecute&#34;` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
   *  - `&#34;NoSchedule&#34;` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
   *  - `&#34;PreferNoSchedule&#34;` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
   */
  public Toleration effect(Effect effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
   */
  public Toleration key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Operator represents a key&#39;s relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
   *
   * Possible enum values:
   *  - `&#34;Equal&#34;`
   *  - `&#34;Exists&#34;`
   */
  public Toleration operator(Operator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
   */
  public Toleration tolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
    return this;
  }

  /**
   * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
   */
  public Toleration value(String value) {
    this.value = value;
    return this;
  }
}
