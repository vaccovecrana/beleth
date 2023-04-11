package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;

/**
 * The pod this Toleration is attached to tolerates any taint that matches the triple &#60;key,value,effect&#62; using the matching operator &#60;operator&#62;.
 */
public class Toleration {
  public String effect;

  public String key;

  public String operator;

  public Long tolerationSeconds;

  public String value;

  /**
   * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
   *
   */
  public Toleration effect(String effect) {
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
   */
  public Toleration operator(String operator) {
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
